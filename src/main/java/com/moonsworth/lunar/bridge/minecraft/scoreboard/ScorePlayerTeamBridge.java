package com.moonsworth.lunar.bridge.minecraft.scoreboard;

import com.moonsworth.lunar.bridge.minecraft.util.EnumChatColor;

/**
 * @author Decencies
 * @since 10/07/2021 14:17
 */
public interface ScorePlayerTeamBridge {
    EnumChatColor bridge$getChatFormat();

    String bridge$formatString(String var1);
}

