package io.github.nickacpt.legacycraft.agent;

import java.lang.instrument.Instrumentation;

/*
 * One of the simplest JavaAgents out there.
 * This one applies modded classes discretely into a loading Java application.
 *
 * This can be used to JarMod anything, but will mostly be used by LegacyCraft to patch a loading game.
 */
public class LegacyCraftAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        inst.addTransformer(new ClassReplacerClassFileTransformer());
    }

}
