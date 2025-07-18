package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pp extends qa {
    ArrayList a;
    private int b;

    public pp(pg pgVar, int i) {
        pg pgVar2;
        super(pgVar);
        this.a = new ArrayList();
        this.f = i;
        pg pgVar3 = this.d;
        pg pgVarN = pgVar3.n(i);
        while (true) {
            pg pgVar4 = pgVarN;
            pgVar2 = pgVar3;
            pgVar3 = pgVar4;
            if (pgVar3 == null) {
                break;
            } else {
                pgVarN = pgVar3.n(this.f);
            }
        }
        this.d = pgVar2;
        this.a.add(pgVar2.o(this.f));
        pg pgVarM = pgVar2.m(this.f);
        while (pgVarM != null) {
            this.a.add(pgVarM.o(this.f));
            pgVarM = pgVarM.m(this.f);
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qa qaVar = (qa) arrayList.get(i2);
            int i3 = this.f;
            if (i3 == 0) {
                qaVar.d.g = this;
            } else if (i3 == 1) {
                qaVar.d.h = this;
            }
        }
        if (this.f == 0 && ((ph) this.d.V).c && this.a.size() > 1) {
            this.d = ((qa) this.a.get(r6.size() - 1)).d;
        }
        this.b = this.f == 0 ? this.d.ak : this.d.al;
    }

    private final pg g() {
        for (int i = 0; i < this.a.size(); i++) {
            pg pgVar = ((qa) this.a.get(i)).d;
            if (pgVar.ai != 8) {
                return pgVar;
            }
        }
        return null;
    }

    private final pg n() {
        pg pgVar;
        int size = this.a.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            pgVar = ((qa) this.a.get(size)).d;
        } while (pgVar.ai == 8);
        return pgVar;
    }

    @Override // defpackage.qa
    public final long a() {
        int size = this.a.size();
        long jA = 0;
        for (int i = 0; i < size; i++) {
            jA = jA + r4.h.e + ((qa) this.a.get(i)).a() + r4.i.e;
        }
        return jA;
    }

    @Override // defpackage.qa
    public final void b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qa) arrayList.get(i)).b();
        }
        int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        pg pgVar = ((qa) this.a.get(0)).d;
        pg pgVar2 = ((qa) this.a.get(size2 - 1)).d;
        if (this.f == 0) {
            pf pfVar = pgVar.K;
            pf pfVar2 = pgVar2.M;
            ps psVarL = l(pfVar, 0);
            int iB = pfVar.b();
            pg pgVarG = g();
            if (pgVarG != null) {
                iB = pgVarG.K.b();
            }
            if (psVarL != null) {
                j(this.h, psVarL, iB);
            }
            ps psVarL2 = l(pfVar2, 0);
            int iB2 = pfVar2.b();
            pg pgVarN = n();
            if (pgVarN != null) {
                iB2 = pgVarN.M.b();
            }
            if (psVarL2 != null) {
                j(this.i, psVarL2, -iB2);
            }
        } else {
            pf pfVar3 = pgVar.L;
            pf pfVar4 = pgVar2.N;
            ps psVarL3 = l(pfVar3, 1);
            int iB3 = pfVar3.b();
            pg pgVarG2 = g();
            if (pgVarG2 != null) {
                iB3 = pgVarG2.L.b();
            }
            if (psVarL3 != null) {
                j(this.h, psVarL3, iB3);
            }
            ps psVarL4 = l(pfVar4, 1);
            int iB4 = pfVar4.b();
            pg pgVarN2 = n();
            if (pgVarN2 != null) {
                iB4 = pgVarN2.N.b();
            }
            if (psVarL4 != null) {
                j(this.i, psVarL4, -iB4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.qa
    public final void c() {
        for (int i = 0; i < this.a.size(); i++) {
            ((qa) this.a.get(i)).c();
        }
    }

    @Override // defpackage.qa
    public final void d() {
        this.l = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qa) arrayList.get(i)).d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017d, code lost:
    
        r3 = java.lang.Math.min(r7, r3.m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0184, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
    
        r3 = java.lang.Math.max(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0189, code lost:
    
        if (r6 <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018b, code lost:
    
        r3 = java.lang.Math.min(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018f, code lost:
    
        if (r3 == r7) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0191, code lost:
    
        r17 = r17 + 1;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0194, code lost:
    
        r14.e.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019a, code lost:
    
        r23 = r5;
        r24 = r6;
        r25 = r11;
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01a2, code lost:
    
        r12 = r26 + 1;
        r3 = r22;
        r5 = r23;
        r6 = r24;
        r11 = r25;
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01b1, code lost:
    
        r22 = r3;
        r23 = r5;
        r24 = r6;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b9, code lost:
    
        if (r17 <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bb, code lost:
    
        r5 = r23 - r17;
        r3 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01bf, code lost:
    
        if (r3 >= r1) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c1, code lost:
    
        r7 = (defpackage.qa) r27.a.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cf, code lost:
    
        if (r7.d.ai != 8) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d2, code lost:
    
        if (r3 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d4, code lost:
    
        if (r3 < r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d6, code lost:
    
        r6 = r6 + r7.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01db, code lost:
    
        r6 = r6 + r7.e.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e0, code lost:
    
        if (r3 >= r8) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e2, code lost:
    
        if (r3 >= r9) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e4, code lost:
    
        r6 = r6 + (-r7.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ea, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ed, code lost:
    
        r5 = r23;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f1, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f4, code lost:
    
        if (r27.b != 2) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f6, code lost:
    
        if (r17 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f8, code lost:
    
        r3 = 0;
        r27.b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fc, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01fe, code lost:
    
        r22 = r3;
        r25 = r11;
        r16 = 0.5f;
        r3 = 0;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x020a, code lost:
    
        if (r6 <= r2) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x020c, code lost:
    
        r27.b = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x020e, code lost:
    
        if (r10 <= 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0210, code lost:
    
        if (r5 != 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0212, code lost:
    
        if (r4 != r9) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0214, code lost:
    
        r27.b = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0216, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0217, code lost:
    
        r7 = r27.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x021a, code lost:
    
        if (r7 != 1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x021c, code lost:
    
        if (r10 <= 1) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x021e, code lost:
    
        r2 = (r2 - r6) / (r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0223, code lost:
    
        if (r10 != 1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0225, code lost:
    
        r2 = (r2 - r6) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x022b, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x022c, code lost:
    
        if (r5 <= 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x022e, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022f, code lost:
    
        r5 = r3;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0232, code lost:
    
        if (r5 >= r1) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0234, code lost:
    
        if (r22 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0236, code lost:
    
        r3 = r1 - (r5 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x023b, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023c, code lost:
    
        r3 = (defpackage.qa) r27.a.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x024a, code lost:
    
        if (r3.d.ai != 8) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x024c, code lost:
    
        r3.h.c(r11);
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0257, code lost:
    
        if (r5 <= 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0259, code lost:
    
        if (r22 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x025b, code lost:
    
        r11 = r11 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x025d, code lost:
    
        r11 = r11 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x025e, code lost:
    
        if (r5 <= 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0260, code lost:
    
        if (r5 < r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0262, code lost:
    
        if (r22 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0264, code lost:
    
        r11 = r11 - r3.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x026a, code lost:
    
        r11 = r11 + r3.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x026f, code lost:
    
        if (r22 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0271, code lost:
    
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0277, code lost:
    
        r3.h.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x027c, code lost:
    
        r6 = r3.e.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0283, code lost:
    
        if (r3.j != 3) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0288, code lost:
    
        if (r3.c != 1) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x028a, code lost:
    
        r6 = r3.e.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x028e, code lost:
    
        if (r22 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0290, code lost:
    
        r11 = r11 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0292, code lost:
    
        r11 = r11 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0293, code lost:
    
        if (r22 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0295, code lost:
    
        r3.h.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x029b, code lost:
    
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02a0, code lost:
    
        r3.g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02a3, code lost:
    
        if (r5 >= r8) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02a5, code lost:
    
        if (r5 >= r9) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02a7, code lost:
    
        if (r22 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02a9, code lost:
    
        r11 = r11 - (-r3.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02b0, code lost:
    
        r11 = r11 + (-r3.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02b6, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02ba, code lost:
    
        if (r7 != 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02bc, code lost:
    
        r2 = (r2 - r6) / (r10 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02c2, code lost:
    
        if (r5 <= 0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02c4, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02c5, code lost:
    
        r5 = r3;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02c8, code lost:
    
        if (r5 >= r1) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02ca, code lost:
    
        if (r22 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02cc, code lost:
    
        r3 = r1 - (r5 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d1, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02d2, code lost:
    
        r3 = (defpackage.qa) r27.a.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02e0, code lost:
    
        if (r3.d.ai != 8) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02e2, code lost:
    
        r3.h.c(r11);
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02ed, code lost:
    
        if (r22 == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02ef, code lost:
    
        r11 = r11 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02f1, code lost:
    
        r11 = r11 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02f2, code lost:
    
        if (r5 <= 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02f4, code lost:
    
        if (r5 < r4) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02f6, code lost:
    
        if (r22 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02f8, code lost:
    
        r11 = r11 - r3.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02fe, code lost:
    
        r11 = r11 + r3.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0303, code lost:
    
        if (r22 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0305, code lost:
    
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x030b, code lost:
    
        r3.h.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0310, code lost:
    
        r6 = r3.e.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0317, code lost:
    
        if (r3.j != 3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x031c, code lost:
    
        if (r3.c != 1) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x031e, code lost:
    
        r6 = java.lang.Math.min(r6, r3.e.m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0326, code lost:
    
        if (r22 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0328, code lost:
    
        r11 = r11 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x032a, code lost:
    
        r11 = r11 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x032b, code lost:
    
        if (r22 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x032d, code lost:
    
        r3.h.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0333, code lost:
    
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0338, code lost:
    
        if (r5 >= r8) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x033a, code lost:
    
        if (r5 >= r9) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x033c, code lost:
    
        if (r22 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x033e, code lost:
    
        r11 = r11 - (-r3.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0345, code lost:
    
        r11 = r11 + (-r3.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x034b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0350, code lost:
    
        if (r7 != 2) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0352, code lost:
    
        r2 = r2 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0355, code lost:
    
        if (r27.f != 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0357, code lost:
    
        r6 = r27.d.af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x035c, code lost:
    
        r6 = r27.d.ag;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0360, code lost:
    
        if (r22 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0362, code lost:
    
        r6 = 1.0f - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0366, code lost:
    
        r2 = (int) ((r2 * r6) + r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x036b, code lost:
    
        if (r2 < 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x036d, code lost:
    
        if (r5 <= 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x036f, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0370, code lost:
    
        if (r22 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0372, code lost:
    
        r11 = r25 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0375, code lost:
    
        r11 = r25 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0377, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0378, code lost:
    
        if (r5 >= r1) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x037a, code lost:
    
        r2 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x037c, code lost:
    
        if (r22 == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x037e, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0381, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0382, code lost:
    
        r3 = (defpackage.qa) r27.a.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0390, code lost:
    
        if (r3.d.ai != 8) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0392, code lost:
    
        r3.h.c(r11);
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x039f, code lost:
    
        if (r5 <= 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03a1, code lost:
    
        if (r5 < r4) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x03a3, code lost:
    
        if (r22 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03a5, code lost:
    
        r11 = r11 - r3.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x03ab, code lost:
    
        r11 = r11 + r3.h.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03b0, code lost:
    
        if (r22 == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03b2, code lost:
    
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x03b8, code lost:
    
        r3.h.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x03bd, code lost:
    
        r6 = r3.e.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x03c4, code lost:
    
        if (r3.j != 3) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03c9, code lost:
    
        if (r3.c != 1) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x03cb, code lost:
    
        r6 = r3.e.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x03d1, code lost:
    
        if (r22 == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03d3, code lost:
    
        r11 = r11 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x03d5, code lost:
    
        r11 = r11 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x03d6, code lost:
    
        if (r22 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x03d8, code lost:
    
        r3.h.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x03de, code lost:
    
        r3.i.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x03e3, code lost:
    
        if (r5 >= r8) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x03e5, code lost:
    
        if (r5 >= r9) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x03e7, code lost:
    
        if (r22 == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x03e9, code lost:
    
        r11 = r11 - (-r3.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x03f0, code lost:
    
        r11 = r11 + (-r3.i.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x03f6, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ef, code lost:
    
        r5 = r16;
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fd, code lost:
    
        r11 = r27.h.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0101, code lost:
    
        if (r3 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0103, code lost:
    
        r11 = r27.i.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0109, code lost:
    
        if (r6 <= r2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010b, code lost:
    
        r13 = r6 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010f, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        r11 = r11 + ((int) ((r13 / 2.0f) + 0.5f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0117, code lost:
    
        r11 = r11 - ((int) ((r13 / 2.0f) + 0.5f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011c, code lost:
    
        if (r5 <= 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011e, code lost:
    
        r13 = r2 - r6;
        r15 = (r13 / r5) + 0.5f;
        r16 = 0.5f;
        r12 = 0;
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012a, code lost:
    
        if (r12 >= r1) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012c, code lost:
    
        r14 = (defpackage.qa) r27.a.get(r12);
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
    
        if (r14.d.ai == r7) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013f, code lost:
    
        if (r14.j != 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0141, code lost:
    
        r3 = r14.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        if (r3.i != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:
    
        r7 = (int) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
    
        if (r18 <= r19) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x014c, code lost:
    
        r23 = r5;
        r7 = (int) (((r14.d.am[r27.f] * r13) / r18) + 0.5f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0161, code lost:
    
        if (r27.f != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0163, code lost:
    
        r5 = r14.d;
        r24 = r6;
        r6 = r5.x;
        r5 = r5.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016c, code lost:
    
        r24 = r6;
        r5 = r14.d;
        r6 = r5.A;
        r5 = r5.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0174, code lost:
    
        r25 = r11;
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017b, code lost:
    
        if (r14.c != 1) goto L101;
     */
    @Override // defpackage.qa, defpackage.pq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.pq r28) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp.e(pq):void");
    }

    @Override // defpackage.qa
    public final boolean f() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!((qa) this.a.get(i)).f()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qa qaVar = (qa) arrayList.get(i);
            sb.append("<");
            sb.append(qaVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
