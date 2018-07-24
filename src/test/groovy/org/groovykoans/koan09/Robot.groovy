/*
 * Copyright (c) 2012-2014 nadavc <https://twitter.com/nadavc>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the WTFPL, Version 2, as published by Sam Hocevar.
 * See the COPYING file for more details.
 */

package org.groovykoans.koan09

import org.codehaus.groovy.runtime.InvokerHelper

class Robot {
    // ------------ START EDITING HERE ----------------------
    int x = 0
    int y = 0

    def left = { x-- }
    def right = { x++ }
    def up = { y++ }
    def down = { y-- }

    def invokeMethod(String name, Object args) {

        name.eachMatch(/(Left|Right|Up|Down)/) {

            switch (it[0]) {
                case 'Left':
                    this.left()
                    break
                case 'Right':
                    this.right()
                    break
                case 'Up':
                    this.up()
                    break
                case 'Down':
                    this.down()
                    break
            }
        }

    }

    // ------------ STOP EDITING HERE  ----------------------
}
