package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awl extends RuntimeException {
    private awl(String str) {
        super(str);
    }

    static awl a(aux auxVar) {
        return new awl(String.format("Description not found for %s entity with connectionKey %s", auxVar.b(), awt.c(auxVar)));
    }

    static awl b(aux auxVar) {
        return new awl(String.format("Title not found for %s entity with connectionKey %s", auxVar.b(), awt.c(auxVar)));
    }
}
