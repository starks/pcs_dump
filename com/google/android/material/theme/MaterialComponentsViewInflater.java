package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.cln;
import defpackage.cnj;
import defpackage.cpb;
import defpackage.cpe;
import defpackage.gr;
import defpackage.gt;
import defpackage.gu;
import defpackage.hg;
import defpackage.hy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final gr a(Context context, AttributeSet attributeSet) {
        return new cpb(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final gt b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final gu c(Context context, AttributeSet attributeSet) {
        return new cln(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final hg d(Context context, AttributeSet attributeSet) {
        return new cnj(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final hy e(Context context, AttributeSet attributeSet) {
        return new cpe(context, attributeSet);
    }
}
