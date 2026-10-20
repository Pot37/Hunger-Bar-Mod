package net.pot37.hungerbarmod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.entity.player.HungerManager;

public final class HungerBarRenderer {
    private HungerBarRenderer() {
    }

    public static void render(DrawContext drawContext, RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.player == null || client.options == null || client.options.hudHidden) {
            return;
        }

        Integer color = HungerBarMod.getCurrentFoodColor();
        if (color == null) {
            return;
        }

        HungerManager hungerManager = client.player.getHungerManager();
        int foodLevel = hungerManager.getFoodLevel();
        if (foodLevel <= 0) {
            return;
        }

        int screenWidth = client.getWindow().getScaledWidth();
        int screenHeight = client.getWindow().getScaledHeight();
        int startX = screenWidth / 2 - 91;
        int startY = screenHeight - 39;

        for (int i = 0; i < 20; i++) {
            int segment = i * 2;
            if (segment >= foodLevel) {
                break;
            }

            int x = startX + (i * 8);
            drawContext.fill(x + 1, startY + 1, x + 8, startY + 8, (color & 0x00FFFFFF) | 0x7F000000);
        }
    }
}
