package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.InterfaceC0010h;
import j$.nio.file.attribute.y;

/* loaded from: classes2.dex */
final class c implements InterfaceC0010h {
    private final y a;
    private final y b;
    private final y c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final Integer i;

    public c(y yVar, y yVar2, y yVar3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = yVar;
        this.b = yVar2;
        this.c = yVar3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final y creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final Object fileKey() {
        return this.i;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final y lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final y lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.InterfaceC0010h
    public final long size() {
        return this.h;
    }
}
