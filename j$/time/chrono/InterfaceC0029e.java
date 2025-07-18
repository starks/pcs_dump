package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.Temporal;

/* renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0029e extends Temporal, j$.time.temporal.l, Comparable {
    InterfaceC0035k C(ZoneOffset zoneOffset);

    n a();

    InterfaceC0026b c();

    /* renamed from: m */
    int compareTo(InterfaceC0029e interfaceC0029e);

    LocalTime toLocalTime();
}
