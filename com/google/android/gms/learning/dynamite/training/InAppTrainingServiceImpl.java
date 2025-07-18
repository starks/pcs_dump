package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.asr;
import defpackage.bba;
import defpackage.bcp;
import defpackage.bfe;
import defpackage.bnb;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bpz;
import defpackage.bqm;
import defpackage.brg;
import defpackage.bsx;
import defpackage.btc;
import defpackage.btg;
import defpackage.btm;
import defpackage.btp;
import defpackage.bve;
import defpackage.bvo;
import defpackage.bwc;
import defpackage.bxz;
import defpackage.cbq;
import defpackage.cbr;
import defpackage.cbx;
import defpackage.ccf;
import defpackage.ccg;
import defpackage.ccj;
import defpackage.cck;
import defpackage.cdm;
import defpackage.cnx;
import defpackage.cxo;
import defpackage.czc;
import defpackage.djy;
import defpackage.djz;
import defpackage.dkq;
import defpackage.eqh;
import defpackage.fcy;
import defpackage.fuu;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppTrainingServiceImpl extends bwc {
    public static final cbx a = cbr.d("brella", "InAppTrngSvcImpl");
    private static final djz f;
    private static djz g;
    public Context b;
    public bqm c;
    public bpz d;
    public String e;
    private cbq k;
    private cdm l;
    private djz m;
    private bba q;
    private bcp r;
    private fuu s;
    private final Object h = new Object();
    private final Map i = new HashMap();
    private final Set j = new HashSet();
    private final Map n = DesugarCollections.synchronizedMap(new HashMap());
    private final Map o = DesugarCollections.synchronizedMap(new HashMap());
    private final IBinder p = new btc(this);

    /* JADX WARN: Can't wrap try/catch for region: R(7:476|(9:(1:95)(9:99|514|100|101|(5:110|111|(1:113)(2:115|(1:117)(2:119|(2:124|125)(1:122)))|114|125)(1:108)|471|126|(4:135|136|137|(39:481|139|(2:141|142)(1:143)|144|(1:146)(6:148|149|(1:151)(7:153|482|154|155|479|156|160)|152|(1:163)(1:165)|166)|167|478|168|(1:170)|171|(1:(2:174|(2:176|(1:178)(1:179))(1:180))(1:181))(1:182)|183|184|468|185|186|(4:497|188|(1:190)(2:192|(4:194|484|195|(1:197)(2:198|(1:200)(5:201|202|499|203|204)))(4:214|215|216|217))|191)(3:220|(1:222)(2:224|(1:226)(6:227|(1:229)(1:230)|231|503|232|233))|223)|234|235|507|236|237|(1:239)|240|(1:242)|243|(1:245)|246|(1:248)|249|(1:251)|252|(1:254)|255|(1:257)|258|(1:260)(1:261)|262|263)(7:286|466|287|465|288|(1:290)(2:291|(2:293|(1:295)(23:304|(2:309|310)|311|(2:493|317)(1:315)|318|(1:320)(1:321)|322|323|528|324|325|518|326|(1:328)|329|(1:331)|332|333|334|(3:336|337|(1:339)(3:340|343|(2:349|350)(2:(1:346)(1:(1:348)(0))|350)))(1:341)|342|343|(0)(0)))(8:296|(3:299|(2:545|301)(1:302)|297)|544|303|304|(3:306|309|310)|311|(22:313|493|317|318|(0)(0)|322|323|528|324|325|518|326|(0)|329|(0)|332|333|334|(0)(0)|342|343|(0)(0))(0)))|351))(5:128|(4:130|(1:132)|133|(0))|136|137|(0)(0))|(2:435|436)(1:550))|501|378|541|379|380|8d3|384|(0)(0))|374|375|505|376|377) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:464|(5:492|25|26|(3:32|33|34)|59)(1:37)|38|486|39|(1:43)(3:45|(5:488|47|48|490|49)|(3:57|58|59)(2:61|62))|44|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:95)(9:99|514|100|101|(5:110|111|(1:113)(2:115|(1:117)(2:119|(2:124|125)(1:122)))|114|125)(1:108)|471|126|(4:135|136|137|(39:481|139|(2:141|142)(1:143)|144|(1:146)(6:148|149|(1:151)(7:153|482|154|155|479|156|160)|152|(1:163)(1:165)|166)|167|478|168|(1:170)|171|(1:(2:174|(2:176|(1:178)(1:179))(1:180))(1:181))(1:182)|183|184|468|185|186|(4:497|188|(1:190)(2:192|(4:194|484|195|(1:197)(2:198|(1:200)(5:201|202|499|203|204)))(4:214|215|216|217))|191)(3:220|(1:222)(2:224|(1:226)(6:227|(1:229)(1:230)|231|503|232|233))|223)|234|235|507|236|237|(1:239)|240|(1:242)|243|(1:245)|246|(1:248)|249|(1:251)|252|(1:254)|255|(1:257)|258|(1:260)(1:261)|262|263)(7:286|466|287|465|288|(1:290)(2:291|(2:293|(1:295)(23:304|(2:309|310)|311|(2:493|317)(1:315)|318|(1:320)(1:321)|322|323|528|324|325|518|326|(1:328)|329|(1:331)|332|333|334|(3:336|337|(1:339)(3:340|343|(2:349|350)(2:(1:346)(1:(1:348)(0))|350)))(1:341)|342|343|(0)(0)))(8:296|(3:299|(2:545|301)(1:302)|297)|544|303|304|(3:306|309|310)|311|(22:313|493|317|318|(0)(0)|322|323|528|324|325|518|326|(0)|329|(0)|332|333|334|(0)(0)|342|343|(0)(0))(0)))|351))(5:128|(4:130|(1:132)|133|(0))|136|137|(0)(0))|(2:435|436)(1:550))|501|378|541|379|380|8d3|384|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x08e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x08e4, code lost:
    
        r1 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x08e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x08e9, code lost:
    
        r1 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x08ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x08ed, code lost:
    
        r1 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x08f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08f5, code lost:
    
        r3 = r39;
        r1 = r42;
        r5 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0980, code lost:
    
        r1.k(defpackage.ccj.c);
        r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x098a, code lost:
    
        monitor-enter(((com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl) r3).h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x098b, code lost:
    
        ((com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl) r3).i.remove(java.lang.Long.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0995, code lost:
    
        throw r0;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02da A[Catch: all -> 0x08ae, TryCatch #9 {all -> 0x08ae, blocks: (B:126:0x02c6, B:128:0x02ca, B:130:0x02d0, B:132:0x02d4, B:133:0x02d6, B:136:0x02ef, B:141:0x0300, B:146:0x0333, B:151:0x0348, B:154:0x0350, B:156:0x0356, B:135:0x02da), top: B:471:0x02c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0378 A[Catch: all -> 0x063a, TRY_ENTER, TryCatch #19 {all -> 0x063a, blocks: (B:139:0x02f8, B:144:0x031b, B:167:0x0395, B:283:0x0639, B:148:0x0336, B:166:0x037c, B:165:0x0378, B:153:0x034c, B:160:0x0370, B:159:0x0361, B:143:0x0308, B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:481:0x02f8, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d5 A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f4 A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04e7 A[Catch: all -> 0x062d, TryCatch #7 {all -> 0x062d, blocks: (B:185:0x0464, B:190:0x0477, B:234:0x054b, B:194:0x048a, B:195:0x04a2, B:198:0x04ae, B:203:0x04b7, B:204:0x04c1, B:212:0x04cd, B:213:0x04d6, B:208:0x04c5, B:209:0x04ca, B:216:0x04de, B:217:0x04e2, B:220:0x04e7, B:222:0x04ee, B:224:0x04fa, B:227:0x0505, B:229:0x051d, B:231:0x0534, B:232:0x0543, B:270:0x0616, B:271:0x0620, B:273:0x0622, B:274:0x062c, B:230:0x0527), top: B:468:0x0464, inners: #21, #38, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x058f A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05a3 A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05b3 A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05c1 A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05ce A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05dc A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05f3 A[Catch: all -> 0x0638, TryCatch #16 {, blocks: (B:168:0x03c3, B:170:0x03d5, B:171:0x03d7, B:178:0x03e5, B:183:0x03f8, B:235:0x057c, B:236:0x057f, B:237:0x058b, B:239:0x058f, B:240:0x0591, B:242:0x05a3, B:243:0x05a6, B:245:0x05b3, B:246:0x05b5, B:248:0x05c1, B:249:0x05c4, B:251:0x05ce, B:252:0x05d0, B:254:0x05dc, B:255:0x05df, B:257:0x05f3, B:258:0x05f5, B:262:0x05fc, B:266:0x0607, B:267:0x0613, B:281:0x0637, B:280:0x0634, B:179:0x03e8, B:180:0x03eb, B:181:0x03ef, B:182:0x03f4, B:277:0x062f), top: B:478:0x03c3, outer: #19, inners: #13, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x076b A[Catch: all -> 0x08aa, TryCatch #5 {all -> 0x08aa, blocks: (B:288:0x0681, B:290:0x0693, B:291:0x06a0, B:293:0x06b1, B:295:0x06c3, B:304:0x070d, B:306:0x0736, B:309:0x073d, B:310:0x074b, B:311:0x074c, B:313:0x0752, B:315:0x0758, B:318:0x0762, B:322:0x076f, B:337:0x083a, B:342:0x0848, B:343:0x086c, B:350:0x0881, B:359:0x0898, B:358:0x0895, B:321:0x076b, B:317:0x075c, B:363:0x089e, B:364:0x08a9, B:296:0x06d0, B:297:0x06da, B:299:0x06e0, B:301:0x06f4, B:302:0x0701, B:326:0x07d8, B:328:0x07f1, B:329:0x07f4, B:331:0x07fe, B:332:0x0804, B:355:0x0890), top: B:465:0x0681, inners: #29, #50, #53 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07f1 A[Catch: all -> 0x088c, TryCatch #50 {all -> 0x088c, blocks: (B:326:0x07d8, B:328:0x07f1, B:329:0x07f4, B:331:0x07fe, B:332:0x0804), top: B:518:0x07d8, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07fe A[Catch: all -> 0x088c, TryCatch #50 {all -> 0x088c, blocks: (B:326:0x07d8, B:328:0x07f1, B:329:0x07f4, B:331:0x07fe, B:332:0x0804), top: B:518:0x07d8, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x02f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x075c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x08d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0473 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x096c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111 A[Catch: all -> 0x0135, TryCatch #15 {all -> 0x0135, blocks: (B:57:0x0111, B:58:0x0116, B:61:0x011d, B:62:0x0129, B:49:0x00dc, B:55:0x0100, B:67:0x0133), top: B:477:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d A[Catch: all -> 0x0135, TRY_ENTER, TryCatch #15 {all -> 0x0135, blocks: (B:57:0x0111, B:58:0x0116, B:61:0x011d, B:62:0x0129, B:49:0x00dc, B:55:0x0100, B:67:0x0133), top: B:477:0x007f }] */
    /* JADX WARN: Type inference failed for: r10v25, types: [dxb] */
    /* JADX WARN: Type inference failed for: r10v30, types: [dxb] */
    /* JADX WARN: Type inference failed for: r10v33, types: [dxb] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [bsx] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [bqm] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v43, types: [bsx] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50, types: [dza, edg] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r3v0, types: [bsx] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r51v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r51v10 */
    /* JADX WARN: Type inference failed for: r51v7 */
    /* JADX WARN: Type inference failed for: r51v8 */
    /* JADX WARN: Type inference failed for: r51v9 */
    /* JADX WARN: Type inference failed for: r8v30, types: [bso] */
    /* renamed from: $r8$lambda$7YftSAcH5ml5Vt2TjPES-4GYZmg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m21$r8$lambda$7YftSAcH5ml5Vt2TjPES4GYZmg(com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl r39, java.lang.String r40, java.lang.String r41, defpackage.bqm r42, java.lang.String r43, long r44, defpackage.bsx r46, defpackage.btw r47, java.lang.String r48, defpackage.cck r49, byte[] r50, java.lang.String r51, byte[] r52, defpackage.btg r53) {
        /*
            Method dump skipped, instructions count: 2470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl.m21$r8$lambda$7YftSAcH5ml5Vt2TjPES4GYZmg(com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl, java.lang.String, java.lang.String, bqm, java.lang.String, long, bsx, btw, java.lang.String, cck, byte[], java.lang.String, byte[], btg):void");
    }

    public static /* synthetic */ void $r8$lambda$7yFM7fFTrbxxIw4saooezJO5994(InAppTrainingServiceImpl inAppTrainingServiceImpl, djy djyVar, btg btgVar) {
        if (djyVar.isCancelled()) {
            inAppTrainingServiceImpl.e(new btm(btgVar, 0));
        }
    }

    static {
        bfe bfeVar = bxz.a;
        eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
        eqhVar.h("brella-inapptrngsvc-%d");
        f = cnx.v(bfeVar.g(eqh.m(eqhVar), 1));
    }

    public static void a(djy djyVar, Context context) {
        try {
            cnx.H(djyVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            a.j(e, "Training failed");
            dkq dkqVar = new dkq(e);
            bnb.a(context, dkqVar);
            throw dkqVar;
        }
    }

    private final void e(btp btpVar) {
        try {
            btpVar.a();
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [bqm, java.lang.Object] */
    private final void f(int i) {
        synchronized (this.h) {
            if (this.i.isEmpty()) {
                this.c.k(i);
            } else {
                Iterator it = this.i.values().iterator();
                while (it.hasNext()) {
                    ((fcy) it.next()).b.k(i);
                }
            }
        }
    }

    @Override // defpackage.bwd
    public void addHttpRequestHandleFactory(String str, bve bveVar) {
        this.o.put(str, bveVar);
    }

    @Override // defpackage.bwd
    public void addHttpUrlConnectionFactory(String str, bvo bvoVar) {
        this.n.put(str, bvoVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [bqm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [djy, java.lang.Object] */
    public final void b(long j) {
        synchronized (this.h) {
            Map map = this.i;
            Long lValueOf = Long.valueOf(j);
            fcy fcyVar = (fcy) map.remove(lValueOf);
            if (fcyVar != null) {
                fcyVar.b.k(ccj.cG);
                ((bsx) fcyVar.a).a();
                fcyVar.c.cancel(true);
            } else {
                this.c.k(ccj.cG);
                this.j.add(lValueOf);
            }
        }
    }

    public final void c(long j, btp btpVar) {
        synchronized (this.h) {
            this.i.remove(Long.valueOf(j));
        }
        e(btpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(final java.lang.String r22, final defpackage.btw r23, final java.lang.String r24, final defpackage.cck r25, final byte[] r26, final defpackage.btg r27, final long r28, byte[] r30) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl.d(java.lang.String, btw, java.lang.String, cck, byte[], btg, long, byte[]):void");
    }

    @Override // defpackage.bwd
    public IBinder onBind(Intent intent) {
        String.valueOf(intent);
        return this.p;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.bwd
    public void onCreate(bpf bpfVar) {
        djz djzVar = f;
        fuu fuuVar = new fuu(this, null);
        bba bbaVar = new bba();
        bcp bcpVar = new bcp();
        try {
            this.b = (Context) bpe.a(bpfVar);
            this.m = djzVar;
            this.s = fuuVar;
            this.q = bbaVar;
            this.r = bcpVar;
            brg.b();
            cbq cbqVarB = cbq.b(this.b.getApplicationContext());
            this.k = cbqVarB;
            this.c = (bqm) cbqVarB.c(bqm.class);
            this.d = (bpz) this.k.c(bpz.class);
            this.e = this.b.getApplicationContext().getPackageName();
            this.l = (cdm) this.k.c(cdm.class);
            this.c.k(ccj.u);
        } catch (Throwable th) {
            bqm bqmVar = this.c;
            if (bqmVar != null) {
                bqmVar.k(ccj.r);
            }
            bnb.a((Context) bpe.a(bpfVar), th);
            throw th;
        }
    }

    @Override // defpackage.bwd
    public void onDestroy() {
        try {
            f(ccj.v);
            synchronized (this.h) {
                if (!this.i.isEmpty()) {
                    f(ccj.x);
                    czc czcVarListIterator = cxo.m(this.i.keySet()).listIterator();
                    while (czcVarListIterator.hasNext()) {
                        b(((Long) czcVarListIterator.next()).longValue());
                    }
                }
            }
            this.k.close();
            if (this.d.bc()) {
                return;
            }
            this.k = null;
        } catch (RuntimeException e) {
            f(ccj.s);
            bnb.a(this.b, e);
            throw e;
        }
    }

    @Override // defpackage.bwd
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    @Override // defpackage.bwd
    public void onTrimMemory(int i) {
        try {
            if (i >= this.d.q()) {
                f(ccj.e);
                synchronized (this.h) {
                    czc czcVarListIterator = cxo.m(this.i.keySet()).listIterator();
                    while (czcVarListIterator.hasNext()) {
                        b(((Long) czcVarListIterator.next()).longValue());
                    }
                }
            }
        } catch (Throwable th) {
            bnb.a(this.b, th);
            throw th;
        }
    }

    @Override // defpackage.bwd
    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void runFlTraining(String str, String str2, String str3, ccf ccfVar, cck cckVar, byte[] bArr, btg btgVar, long j, byte[] bArr2) {
        asr asrVar = (asr) ccg.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ccg ccgVar = (ccg) asrVar.a;
        str2.getClass();
        ccgVar.c = str2;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((ccg) asrVar.a).d = ccfVar.a();
        d(str, bba.d((ccg) asrVar.z()), str3, cckVar, bArr, btgVar, j, bArr2);
    }

    @Override // defpackage.bwd
    public void setPRFSdkImpl() {
    }

    @Override // defpackage.bwd
    public void onRebind(Intent intent) {
    }
}
