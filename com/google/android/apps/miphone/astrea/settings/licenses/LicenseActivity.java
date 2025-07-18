package com.google.android.apps.miphone.astrea.settings.licenses;

import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.as.oss.R;
import defpackage.C0000do;
import defpackage.bdp;
import defpackage.bdq;
import defpackage.bfe;
import defpackage.cc;
import defpackage.cm;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseActivity extends cm {
    @Override // defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        String strD;
        super.onCreate(bundle);
        setContentView(R.layout.pcs_license_activity);
        bdp bdpVar = (bdp) getIntent().getParcelableExtra("license");
        if (p() != null) {
            cc ccVarP = p();
            ((C0000do) ccVarP).p.j(bdpVar.a);
            ((C0000do) p()).h(2, 2);
            p().d(true);
            ((C0000do) p()).p.g(null);
        }
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = bdpVar.b;
        int i = bdpVar.c;
        String str = bdpVar.d;
        if (!str.isEmpty()) {
            try {
                String strC = bfe.c(new BufferedInputStream(new FileInputStream(str)), j, i);
                if (strC != null) {
                    if (!strC.isEmpty()) {
                        strD = strC;
                    }
                }
            } catch (FileNotFoundException unused) {
            }
            throw new RuntimeException(String.valueOf(str).concat(" does not contain res/raw/third_party_licenses"));
        }
        strD = bfe.d(this, "third_party_licenses", j, i);
        if (strD == null) {
            finish();
        } else {
            textView.setText(strD);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new bdq(this, i, scrollView, 0));
        }
    }

    @Override // defpackage.lx, defpackage.bz, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
