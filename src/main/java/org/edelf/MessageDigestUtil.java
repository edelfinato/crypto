package org.edelf;

import org.bouncycastle.util.encoders.Hex;

public class MessageDigestUtil {
    static class SHA3 {
        static private org.bouncycastle.jcajce.provider.digest.SHA3.Digest256 digest256 = new org.bouncycastle.jcajce.provider.digest.SHA3.Digest256();
        static private org.bouncycastle.jcajce.provider.digest.SHA3.Digest384 digest384 = new org.bouncycastle.jcajce.provider.digest.SHA3.Digest384();

        public static String digest256(byte[] toDigested) {
            byte[] digest = digest256.digest(toDigested);
            return Hex.toHexString(digest);
        }

        public static String digest384(byte[] toDigested) {
            byte[] digest = digest384.digest(toDigested);
            return Hex.toHexString(digest);
        }
    }
}
