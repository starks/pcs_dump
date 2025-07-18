package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efz implements egg {
    public static final efz a = new efz(1);
    private final /* synthetic */ int b;

    public efz(int i) {
        this.b = i;
    }

    @Override // defpackage.egg
    public final egf a(Class cls) {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!efb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (egf) efb.getDefaultInstance(cls.asSubclass(efb.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // defpackage.egg
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return efb.class.isAssignableFrom(cls);
        }
        return false;
    }
}
