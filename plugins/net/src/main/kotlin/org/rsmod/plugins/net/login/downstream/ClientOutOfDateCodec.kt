package org.rsmod.plugins.net.login.downstream

import org.rsmod.game.protocol.packet.ZeroLengthPacketCodec
import javax.inject.Singleton

@Singleton
public class ClientOutOfDateCodec : ZeroLengthPacketCodec<LoginResponse.ClientOutOfDate>(
    packet = LoginResponse.ClientOutOfDate,
    opcode = 6
)
