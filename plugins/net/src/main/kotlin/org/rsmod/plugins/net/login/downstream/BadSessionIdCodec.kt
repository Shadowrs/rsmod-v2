package org.rsmod.plugins.net.login.downstream

import org.rsmod.game.protocol.packet.ZeroLengthPacketCodec
import javax.inject.Singleton

@Singleton
public class BadSessionIdCodec : ZeroLengthPacketCodec<LoginResponse.BadSessionId>(
    packet = LoginResponse.BadSessionId,
    opcode = 10
)
