package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clm extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new byl(9);
    int a;

    public clm(Parcel parcel) {
        super(parcel);
        this.a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = this.a;
        return "MaterialCheckBox.SavedState{" + hexString + " CheckedState=" + (i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked") + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.a));
    }

    public clm(Parcelable parcelable) {
        super(parcelable);
    }
}
