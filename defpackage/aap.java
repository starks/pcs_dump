package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aap extends aak {
    public final yz a;
    public final aao b;

    public aap(yz yzVar, fsc fscVar) {
        this.a = yzVar;
        this.b = (aao) new aac(fscVar, aao.a).a(aao.class);
    }

    public static boolean c(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Override // defpackage.aak
    @Deprecated
    public final void b(String str, PrintWriter printWriter) {
        aao aaoVar = this.b;
        if (aaoVar.b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strValueOf = String.valueOf(str);
            for (int i = 0; i < aaoVar.b.b(); i++) {
                String strConcat = strValueOf.concat("    ");
                aal aalVar = (aal) aaoVar.b.c(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aaoVar.b.a(i));
                printWriter.print(": ");
                printWriter.println(aalVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(aalVar.g);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                printWriter.println(aalVar.h);
                aas aasVar = aalVar.h;
                String strConcat2 = String.valueOf(strConcat).concat("  ");
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(aasVar.c);
                printWriter.print(" mListener=");
                printWriter.println(aasVar.i);
                if (aasVar.e || aasVar.h) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(aasVar.e);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aasVar.h);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aasVar.f || aasVar.g) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aasVar.f);
                    printWriter.print(" mReset=");
                    printWriter.println(aasVar.g);
                }
                aar aarVar = (aar) aasVar;
                if (aarVar.a != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(aarVar.a);
                    printWriter.print(" waiting=");
                    boolean z = aarVar.a.a;
                    printWriter.println(false);
                }
                if (aarVar.b != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aarVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = aarVar.b.a;
                    printWriter.println(false);
                }
                if (aalVar.i != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(aalVar.i);
                    aam aamVar = aalVar.i;
                    printWriter.print(String.valueOf(strConcat).concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(aamVar.b);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                aas aasVar2 = aalVar.h;
                printWriter.println(aas.j(aalVar.a()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(aalVar.j());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.a.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.a)));
        sb.append("}}");
        return sb.toString();
    }
}
