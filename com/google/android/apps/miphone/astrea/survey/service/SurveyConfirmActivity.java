package com.google.android.apps.miphone.astrea.survey.service;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import defpackage.bet;
import defpackage.bfo;
import defpackage.bfr;
import defpackage.czn;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SurveyConfirmActivity extends bfo {
    private static final czn l = czn.j("com/google/android/apps/miphone/astrea/survey/service/SurveyConfirmActivity");
    public bet j;
    public bfr k;
    private Map m;
    private ImageButton n;
    private Button o;
    private Button p;

    private static final int H(Context context, int i) {
        return context.getResources().getDimensionPixelOffset(i);
    }

    private static final void I(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public final void D() {
        G();
        setResult(0);
        finish();
    }

    public final void G() {
        Button button = this.o;
        if (button == null || this.p == null || this.n == null) {
            return;
        }
        button.setOnClickListener(null);
        this.p.setOnClickListener(null);
        this.n.setOnClickListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    @Override // defpackage.bfo, defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.miphone.astrea.survey.service.SurveyConfirmActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ae, android.app.Activity
    protected final void onPause() {
        if (isFinishing()) {
            overridePendingTransition(0, 0);
        }
        super.onPause();
    }

    @Override // defpackage.cm, defpackage.ae, android.app.Activity
    protected final void onStart() {
        overridePendingTransition(0, 0);
        super.onStart();
    }
}
