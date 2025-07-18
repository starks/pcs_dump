package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bc {
    public final ab a;
    public final bnz c;
    private final bd d;
    private boolean e = false;
    public int b = -1;

    public bc(bnz bnzVar, bd bdVar, ab abVar) {
        this.c = bnzVar;
        this.d = bdVar;
        this.a = abVar;
    }

    final void a() {
        ab abVar;
        View view;
        View view2;
        View view3 = this.a.N;
        while (true) {
            abVar = null;
            if (view3 == null) {
                break;
            }
            ab abVarF = ax.f(view3);
            if (abVarF != null) {
                abVar = abVarF;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        ab abVar2 = this.a.C;
        if (abVar != null && !abVar.equals(abVar2)) {
            ab abVar3 = this.a;
            int i = abVar3.E;
            yb ybVar = yb.a;
            abVar3.getClass();
            yi yiVar = new yi(abVar3, abVar, i);
            yb.d(yiVar);
            ya yaVarB = yb.b(abVar3);
            if (yaVarB.b.contains(xz.DETECT_WRONG_NESTED_HIERARCHY) && yb.e(yaVarB, abVar3.getClass(), yiVar.getClass())) {
                yb.c(yaVarB, yiVar);
            }
        }
        bd bdVar = this.d;
        ab abVar4 = this.a;
        ViewGroup viewGroup = abVar4.N;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = bdVar.a.indexOf(abVar4);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= bdVar.a.size()) {
                            break;
                        }
                        ab abVar5 = (ab) bdVar.a.get(iIndexOf);
                        if (abVar5.N == viewGroup && (view = abVar5.O) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ab abVar6 = (ab) bdVar.a.get(i2);
                    if (abVar6.N == viewGroup && (view2 = abVar6.O) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        ab abVar7 = this.a;
        abVar7.N.addView(abVar7.O, iIndexOfChild);
    }

    final void b() throws Resources.NotFoundException {
        String resourceName;
        if (this.a.t) {
            return;
        }
        if (ax.X(3)) {
            Objects.toString(this.a);
        }
        Bundle bundle = this.a.g;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        ab abVar = this.a;
        LayoutInflater layoutInflaterC = abVar.C(bundle2);
        ViewGroup viewGroup2 = abVar.N;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abVar.E;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.a + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abVar.z.m.a(i);
                if (viewGroup == null) {
                    ab abVar2 = this.a;
                    if (!abVar2.w && !abVar2.v) {
                        try {
                            resourceName = abVar2.t().getResourceName(this.a.E);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.a.E) + " (" + resourceName + ") for fragment " + this.a);
                    }
                } else if (!(viewGroup instanceof ah)) {
                    ab abVar3 = this.a;
                    yb ybVar = yb.a;
                    abVar3.getClass();
                    yh yhVar = new yh(abVar3, viewGroup);
                    yb.d(yhVar);
                    ya yaVarB = yb.b(abVar3);
                    if (yaVarB.b.contains(xz.DETECT_WRONG_FRAGMENT_CONTAINER) && yb.e(yaVarB, abVar3.getClass(), yhVar.getClass())) {
                        yb.c(yaVarB, yhVar);
                    }
                }
            }
        }
        ab abVar4 = this.a;
        abVar4.N = viewGroup;
        abVar4.k(layoutInflaterC, viewGroup, bundle2);
        if (this.a.O != null) {
            if (ax.X(3)) {
                Objects.toString(this.a);
            }
            this.a.O.setSaveFromParentEnabled(false);
            ab abVar5 = this.a;
            abVar5.O.setTag(R.id.fragment_container_view_tag, abVar5);
            if (viewGroup != null) {
                a();
            }
            ab abVar6 = this.a;
            if (abVar6.G) {
                abVar6.O.setVisibility(8);
            }
            if (this.a.O.isAttachedToWindow()) {
                View view = this.a.O;
                int[] iArr = ut.a;
                ul.b(view);
            } else {
                View view2 = this.a.O;
                view2.addOnAttachStateChangeListener(new ex(view2, 1));
            }
            this.a.S();
            bnz bnzVar = this.c;
            ab abVar7 = this.a;
            bnzVar.y(abVar7, abVar7.O, bundle2, false);
            int visibility = this.a.O.getVisibility();
            this.a.v().o = this.a.O.getAlpha();
            ab abVar8 = this.a;
            if (abVar8.N != null && visibility == 0) {
                View viewFindFocus = abVar8.O.findFocus();
                if (viewFindFocus != null) {
                    this.a.W(viewFindFocus);
                    if (ax.X(2)) {
                        Objects.toString(viewFindFocus);
                        Objects.toString(this.a);
                    }
                }
                this.a.O.setAlpha(0.0f);
            }
        }
        this.a.f = 2;
    }

    final void c() {
        ab abVar = this.a;
        if (abVar.t && abVar.u && !abVar.x) {
            if (ax.X(3)) {
                Objects.toString(this.a);
            }
            Bundle bundle = this.a.g;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ab abVar2 = this.a;
            abVar2.k(abVar2.C(bundle2), null, bundle2);
            View view = this.a.O;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ab abVar3 = this.a;
                abVar3.O.setTag(R.id.fragment_container_view_tag, abVar3);
                ab abVar4 = this.a;
                if (abVar4.G) {
                    abVar4.O.setVisibility(8);
                }
                this.a.S();
                bnz bnzVar = this.c;
                ab abVar5 = this.a;
                bnzVar.y(abVar5, abVar5.O, bundle2, false);
                this.a.f = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:379:0x03cc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03cc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:281:0x055f A[Catch: all -> 0x06ba, TryCatch #0 {all -> 0x06ba, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0021, B:80:0x0109, B:87:0x011d, B:89:0x0123, B:90:0x0128, B:95:0x0134, B:103:0x014a, B:105:0x0153, B:98:0x0139, B:100:0x013f, B:102:0x0145, B:106:0x0166, B:108:0x0189, B:109:0x0190, B:93:0x0130, B:110:0x01af, B:111:0x01b3, B:113:0x01b9, B:114:0x01be, B:116:0x01d5, B:118:0x01e0, B:119:0x01e7, B:120:0x01f5, B:121:0x0200, B:122:0x0201, B:124:0x0205, B:126:0x0209, B:128:0x0223, B:129:0x0228, B:130:0x022b, B:131:0x0231, B:133:0x0237, B:134:0x023c, B:136:0x0242, B:138:0x0248, B:140:0x025a, B:142:0x0260, B:143:0x0263, B:145:0x0267, B:147:0x026b, B:149:0x0271, B:151:0x0275, B:152:0x027c, B:154:0x0285, B:156:0x0289, B:157:0x0291, B:158:0x029c, B:159:0x029d, B:160:0x02ad, B:161:0x02b8, B:162:0x02b9, B:163:0x02c1, B:165:0x02c7, B:166:0x02cc, B:168:0x02d2, B:170:0x02d8, B:172:0x02de, B:174:0x0301, B:175:0x0311, B:176:0x031c, B:177:0x031d, B:178:0x0324, B:180:0x032a, B:181:0x032f, B:184:0x0339, B:186:0x0343, B:197:0x03a6, B:198:0x03a9, B:187:0x034f, B:188:0x0372, B:189:0x0373, B:191:0x0377, B:194:0x0380, B:195:0x03a3, B:199:0x03c7, B:200:0x03c9, B:202:0x03cf, B:204:0x03d5, B:205:0x03da, B:207:0x03e5, B:208:0x03ec, B:209:0x0401, B:210:0x0404, B:212:0x040a, B:213:0x040f, B:215:0x041a, B:216:0x0421, B:218:0x0433, B:219:0x043b, B:220:0x0446, B:221:0x0447, B:223:0x044d, B:224:0x0452, B:226:0x045a, B:228:0x045e, B:229:0x0461, B:231:0x0467, B:233:0x046b, B:235:0x0479, B:236:0x047e, B:237:0x0481, B:238:0x0487, B:239:0x048d, B:241:0x0493, B:242:0x0498, B:244:0x049e, B:246:0x04a2, B:247:0x04a5, B:248:0x04c6, B:250:0x04ce, B:251:0x04d3, B:253:0x04d9, B:258:0x04e4, B:260:0x04f1, B:263:0x04fe, B:265:0x0504, B:267:0x050c, B:269:0x0510, B:270:0x0514, B:271:0x051a, B:273:0x0522, B:276:0x0534, B:278:0x053b, B:279:0x0544, B:281:0x055f, B:282:0x0570, B:284:0x0576, B:286:0x057e, B:288:0x058c, B:289:0x0593, B:291:0x0599, B:292:0x05a1, B:293:0x05a8, B:294:0x05b3, B:274:0x0529, B:295:0x05b4, B:297:0x05ba, B:298:0x05bf, B:300:0x05ce, B:302:0x05d4, B:303:0x05de, B:305:0x05f3, B:311:0x0608, B:313:0x060e, B:314:0x0613, B:308:0x05fa, B:315:0x061a, B:316:0x0625, B:319:0x062a, B:321:0x062e, B:323:0x0634, B:325:0x063e, B:326:0x0643, B:328:0x0657, B:329:0x065c, B:330:0x0661, B:332:0x0667, B:334:0x066b, B:336:0x066f, B:338:0x067d, B:340:0x0683, B:341:0x0688, B:342:0x068c, B:344:0x0692, B:345:0x0697, B:346:0x069a, B:348:0x06a0, B:350:0x06a4, B:352:0x06aa, B:353:0x06ac, B:13:0x0025, B:18:0x0037, B:22:0x004a, B:24:0x0050, B:26:0x0054, B:28:0x0060, B:30:0x0066, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:35:0x007a, B:37:0x0080, B:39:0x0084, B:40:0x0088, B:42:0x008e, B:43:0x0092, B:45:0x0098, B:47:0x00ab, B:49:0x00af, B:51:0x00b5, B:54:0x00bb, B:60:0x00c5, B:69:0x00e6, B:71:0x00ec, B:73:0x00f0, B:74:0x00f4, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00cc, B:63:0x00d1, B:65:0x00d7, B:67:0x00dd, B:68:0x00e2, B:19:0x003c, B:20:0x0041, B:21:0x0046), top: B:359:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d() {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc.d():void");
    }

    final void e(ClassLoader classLoader) {
        Bundle bundle = this.a.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.a.g.getBundle("savedInstanceState") == null) {
            this.a.g.putBundle("savedInstanceState", new Bundle());
        }
        try {
            ab abVar = this.a;
            abVar.h = abVar.g.getSparseParcelableArray("viewState");
            ab abVar2 = this.a;
            abVar2.i = abVar2.g.getBundle("viewRegistryState");
            bb bbVar = (bb) this.a.g.getParcelable("state");
            if (bbVar != null) {
                ab abVar3 = this.a;
                abVar3.n = bbVar.m;
                abVar3.o = bbVar.n;
                Boolean bool = abVar3.j;
                abVar3.Q = bbVar.o;
            }
            ab abVar4 = this.a;
            if (abVar4.Q) {
                return;
            }
            abVar4.P = true;
        } catch (BadParcelableException e) {
            ab abVar5 = this.a;
            Objects.toString(abVar5);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(abVar5)), e);
        }
    }

    final void f() {
        if (this.a.O == null) {
            return;
        }
        if (ax.X(2)) {
            Objects.toString(this.a);
            Objects.toString(this.a.O);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.O.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.a.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.a.Y.b.d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.a.i = bundle;
    }

    public bc(bnz bnzVar, bd bdVar, ab abVar, Bundle bundle) {
        this.c = bnzVar;
        this.d = bdVar;
        this.a = abVar;
        abVar.h = null;
        abVar.i = null;
        abVar.y = 0;
        abVar.u = false;
        abVar.p = false;
        ab abVar2 = abVar.m;
        abVar.n = abVar2 != null ? abVar2.k : null;
        abVar.m = null;
        abVar.g = bundle;
        abVar.l = bundle.getBundle("arguments");
    }

    public bc(bnz bnzVar, bd bdVar, ClassLoader classLoader, ai aiVar, Bundle bundle) {
        this.c = bnzVar;
        this.d = bdVar;
        bb bbVar = (bb) bundle.getParcelable("state");
        ab abVarB = aiVar.b(bbVar.a);
        abVarB.k = bbVar.b;
        abVarB.t = bbVar.c;
        abVarB.v = bbVar.d;
        abVarB.w = true;
        abVarB.D = bbVar.e;
        abVarB.E = bbVar.f;
        abVarB.F = bbVar.g;
        abVarB.I = bbVar.h;
        abVarB.q = bbVar.i;
        abVarB.H = bbVar.j;
        abVarB.G = bbVar.k;
        abVarB.W = yv.values()[bbVar.l];
        abVarB.n = bbVar.m;
        abVarB.o = bbVar.n;
        abVarB.Q = bbVar.o;
        this.a = abVarB;
        abVarB.g = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abVarB.V(bundle2);
        if (ax.X(2)) {
            Objects.toString(abVarB);
        }
    }
}
