   package com.example.coasterchainguard.mixin;

   import org.spongepowered.asm.mixin.Mixin;
   import org.spongepowered.asm.mixin.injection.At;
   import org.spongepowered.asm.mixin.injection.Inject;
   import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

   @Mixin(targets = "dev.silvergold.simulatedcoasters.track.cart.CoasterCartTrainLinkConstraint")
   public abstract class CartLinkTensionMixin {

       @Inject(method = "isUnderExtremeTension", at = @At("HEAD"), cancellable = true, remap = false)
       private static void coasterchainguard$neverSnap(CallbackInfoReturnable<Boolean> cir) {
           cir.setReturnValue(false);
       }
   }
