package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class del extends ddp implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public del(String str, int i, String str2) {
        this.d = str2;
        MessageDigest messageDigestE = e(str);
        this.a = messageDigestE;
        int digestLength = messageDigestE.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        clq.B(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = f(messageDigestE);
    }

    private static MessageDigest e(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean f(MessageDigest messageDigest) throws CloneNotSupportedException {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.ddz
    public final dea d() {
        if (this.c) {
            try {
                return new dej((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new dej(e(this.a.getAlgorithm()), this.b);
    }

    public final String toString() {
        return this.d;
    }

    Object writeReplace() {
        return new dek(this.a.getAlgorithm(), this.b, this.d);
    }

    public del(String str, String str2) {
        MessageDigest messageDigestE = e(str);
        this.a = messageDigestE;
        this.b = messageDigestE.getDigestLength();
        this.d = str2;
        this.c = f(messageDigestE);
    }
}
