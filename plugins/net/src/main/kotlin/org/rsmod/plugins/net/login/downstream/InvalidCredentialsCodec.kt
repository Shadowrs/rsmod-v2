package org.rsmod.plugins.net.login.downstream

import org.rsmod.game.protocol.packet.ZeroLengthPacketCodec
import javax.inject.Singleton

@Singleton
public class InvalidCredentialsCodec : ZeroLengthPacketCodec<LoginResponse.InvalidCredentials>(
    packet = LoginResponse.InvalidCredentials,
    opcode = 3
)
