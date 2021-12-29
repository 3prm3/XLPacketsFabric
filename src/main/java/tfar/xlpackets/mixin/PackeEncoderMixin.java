package tfar.xlpackets.mixin;

import net.minecraft.network.PacketEncoder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PacketEncoder.class)
public class PackeEncoderMixin {
	@ModifyConstant(method = "encode",constant = @Constant(intValue = 5242880))
	private int xlPackets(int old) {
		return 5000000000;
	}
}
