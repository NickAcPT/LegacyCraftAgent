package io.github.nickacpt.legacycraft.agent;

import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class ClassReplacerClassFileTransformer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {

        InputStream modifiedClass = LegacyCraftAgent.class.getClassLoader().getResourceAsStream("classes/" + className + ".class");
        if (modifiedClass != null) {
            try (modifiedClass) {
                // Class has been modded successfully.
                return modifiedClass.readAllBytes();
            } catch (IOException e) {
                e.printStackTrace();
                throw new IllegalClassFormatException(e.getMessage());
            }
        }

        return null;
    }
}
