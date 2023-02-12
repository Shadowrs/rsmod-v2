package org.rsmod.plugins.info.player.model

public class Avatar {

    public var extendedInfoFlags: Short = 0
    public var extendedInfoLength: Short = 0
    public var playerIndex: Short = 0
    public var currCoords: Int = 0
    public var prevCoords: Int = 0

    public companion object {

        public val ZERO: Avatar = Avatar()
    }
}
