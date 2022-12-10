/*
 * Copyright (c) 2004-2020, Oracle and/or its affiliates.
 *
 * Licensed under the 2-clause BSD license.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.oracle.labs.mlrg.olcut.util;

import java.util.logging.Logger;

/**
 * @deprecated
 * The Getopt mechanism for getting command-line args has been deprecated
 * in favor of using {@link com.oracle.labs.mlrg.olcut.config.Options}
 */
@Deprecated
public final class Getopt {
    private static final Logger logger = Logger.getLogger(Getopt.class.getName());

    private final String[] argList;// the argument List to be parsed
    private final String optStr;   // the string of arguments in the form "ab:" see getopt man
    public String optArg;          // argument of an option
    public int optInd = 0;         // index of the option
    private int nbArgs = 0;        // number of args in the argList
    private int optPos = 1;        // position of option letter in current argument scanned

    static final int EOF = -1; // returned when no option left

    public Getopt(String[] args, String opts) {
        argList = args;
        nbArgs = argList.length;
        optStr = opts;
        optInd = 0;
        optPos = 1;
        optArg = null;
    }

    private void optError(String msg, char optLetter) {
        logger.warning("Getopt: " + msg + " / " + optLetter);
    }

    public int getopt() {
        optArg = null;

        // checking boundaries cases
        if (argList == null || optStr == null) return EOF;
        if (optInd < 0 || optInd >= nbArgs) return EOF;

        // get current Arg out of the argList
        String currentArg = argList[optInd];
        int argLength = currentArg.length();

        // checking special cases
        // if arg starts with optLetter "a", "xyz"..
        // if arg only 1 char in length "a", "-"
        if (argLength <= 1 || currentArg.charAt(0) != '-') {
            return EOF;
        } else if (currentArg.equals("--")) { // end of options case
            optInd++;
            return EOF;
        }

        // get next "letter" from option argument
        char optLetter = currentArg.charAt(optPos);

        // find position of option in optStr
        int pos = optStr.indexOf(optLetter);
        if (pos == -1 || optLetter == ':') {
            optError("illegal option", optLetter);
            optLetter = '?';
        } else { // check if option requires argument
            if (pos < optStr.length() - 1 && optStr.charAt(pos + 1) == ':') {
                // if remain characters after the current option in currentArg
                if (optPos != argLength - 1) {
                    // take rest of current arg as the option argument
                    optArg = currentArg.substring(optPos + 1);
                    optPos = argLength - 1; // go to next arg below in argList
                } else { // take next arg as optArg
                    optInd++;
                    if (optInd < nbArgs &&
                            (argList[optInd].charAt(0) != '-' ||
                                    argList[optInd].length() >= 2 &&
                                            (optStr.indexOf(argList[optInd].charAt(1)) == -1 ||
                                                    argList[optInd].charAt(1) == ':')
                            )
                            ) {
                        optArg = argList[optInd];
                    } else {
                        optError("option '" + optLetter + "' requires an argument", optLetter);
                        optArg = null;
                        optLetter = '?';
                    }
                }
            }
        }

        // next option argument,
        // either in currentArg or next arg in argList
        optPos++;

        // if no more option in currentArg
        if (optPos >= argLength) {
            optInd++;
            optPos = 1;  // reset position of opt letter
        }
        return optLetter;
    }

}


