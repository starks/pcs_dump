package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abj extends x implements DialogInterface.OnClickListener {
    private DialogPreference ab;
    private CharSequence ac;
    private CharSequence ad;
    private CharSequence ae;
    public int af;
    private CharSequence ag;
    private int ah;
    private BitmapDrawable ai;

    protected void al(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.ag;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void am(boolean z);

    protected boolean ao() {
        return false;
    }

    public final DialogPreference ap() {
        if (this.ab == null) {
            this.ab = (DialogPreference) ((aav) w()).aT(u().getString("key"));
        }
        return this.ab;
    }

    @Override // defpackage.x, defpackage.ab
    public void d(Bundle bundle) {
        super.d(bundle);
        yz yzVarW = w();
        if (!(yzVarW instanceof aav)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        aav aavVar = (aav) yzVarW;
        String string = u().getString("key");
        if (bundle != null) {
            this.ac = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.ad = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.ae = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.ag = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.ah = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.ai = new BitmapDrawable(t(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aavVar.aT(string);
        this.ab = dialogPreference;
        this.ac = dialogPreference.a;
        this.ad = dialogPreference.d;
        this.ae = dialogPreference.e;
        this.ag = dialogPreference.b;
        this.ah = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.ai = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.ai = new BitmapDrawable(t(), bitmapCreateBitmap);
    }

    @Override // defpackage.x, defpackage.ab
    public void g(Bundle bundle) {
        super.g(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ac);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ad);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.ae);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.ag);
        bundle.putInt("PreferenceDialogFragment.layout", this.ah);
        BitmapDrawable bitmapDrawable = this.ai;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // defpackage.x
    public final Dialog m() {
        this.af = -2;
        sx sxVar = new sx(s());
        sxVar.g(this.ac);
        sxVar.e(this.ai);
        sxVar.f(this.ad, this);
        cg cgVar = (cg) sxVar.b;
        cgVar.i = this.ae;
        cgVar.j = this;
        s();
        int i = this.ah;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterC = this.T;
            if (layoutInflaterC == null) {
                layoutInflaterC = C(null);
            }
            viewInflate = layoutInflaterC.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            al(viewInflate);
            ((cg) sxVar.b).q = viewInflate;
        } else {
            ((cg) sxVar.b).f = this.ag;
        }
        aM(sxVar);
        ck ckVarD = sxVar.d();
        if (ao()) {
            ckVarD.getWindow().getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
        return ckVarD;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.af = i;
    }

    @Override // defpackage.x, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        am(this.af == -1);
    }

    protected void aM(sx sxVar) {
    }
}
