package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abe implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ abf a;

    public abe(abf abfVar) {
        this.a = abfVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        abf abfVar = this.a;
        boolean z2 = abfVar.ac;
        if (z) {
            abfVar.ac = z2 | abfVar.ab.add(abfVar.ae[i].toString());
        } else {
            abfVar.ac = z2 | abfVar.ab.remove(abfVar.ae[i].toString());
        }
    }
}
