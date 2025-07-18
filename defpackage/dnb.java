package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dnb implements drw {
    private final /* synthetic */ int a;

    public /* synthetic */ dnb(int i) {
        this.a = i;
    }

    @Override // defpackage.drw
    public final dsk a(dli dliVar) {
        switch (this.a) {
            case 0:
                dna dnaVar = (dna) dliVar;
                drx drxVar = dnf.a;
                asr asrVar = (asr) dve.a.createBuilder();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ((dve) asrVar.a).b = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                eea byteString = dnf.b(dnaVar).toByteString();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ((dve) asrVar.a).c = byteString;
                dvn dvnVarC = dnf.c(dnaVar.a);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ((dve) asrVar.a).d = dvnVarC.a();
                return dsg.b((dve) asrVar.z());
            case 1:
                dmv dmvVar = (dmv) dliVar;
                drx drxVar2 = dmw.a;
                asr asrVar2 = (asr) dve.a.createBuilder();
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ((dve) asrVar2.a).b = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                asr asrVar3 = (asr) dvk.a.createBuilder();
                String str = dmvVar.a;
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                dvk dvkVar = (dvk) asrVar3.a;
                str.getClass();
                dvkVar.b = str;
                eea byteString2 = ((dvk) asrVar3.z()).toByteString();
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ((dve) asrVar2.a).c = byteString2;
                dvn dvnVarB = dmw.b(dmvVar.b);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ((dve) asrVar2.a).d = dvnVarB.a();
                return dsg.b((dve) asrVar2.z());
            case 2:
                dlx dlxVar = (dlx) dliVar;
                drx drxVar3 = dnq.a;
                asr asrVar4 = (asr) dve.a.createBuilder();
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                ((dve) asrVar4.a).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                asr asrVar5 = (asr) dts.a.createBuilder();
                asr asrVar6 = (asr) dtu.a.createBuilder();
                asr asrVar7 = (asr) dtv.a.createBuilder();
                int i = dlxVar.c;
                if (!asrVar7.a.isMutable()) {
                    asrVar7.B();
                }
                ((dtv) asrVar7.a).b = i;
                dtv dtvVar = (dtv) asrVar7.z();
                if (!asrVar6.a.isMutable()) {
                    asrVar6.B();
                }
                dtu dtuVar = (dtu) asrVar6.a;
                dtvVar.getClass();
                dtuVar.c = dtvVar;
                dtuVar.b |= 1;
                int i2 = dlxVar.a;
                if (!asrVar6.a.isMutable()) {
                    asrVar6.B();
                }
                ((dtu) asrVar6.a).d = i2;
                dtu dtuVar2 = (dtu) asrVar6.z();
                if (!asrVar5.a.isMutable()) {
                    asrVar5.B();
                }
                dts dtsVar = (dts) asrVar5.a;
                dtuVar2.getClass();
                dtsVar.c = dtuVar2;
                dtsVar.b |= 1;
                asr asrVar8 = (asr) dus.a.createBuilder();
                dut dutVarC = dnq.c(dlxVar);
                if (!asrVar8.a.isMutable()) {
                    asrVar8.B();
                }
                dus dusVar = (dus) asrVar8.a;
                dutVarC.getClass();
                dusVar.c = dutVarC;
                dusVar.b |= 1;
                int i3 = dlxVar.b;
                if (!asrVar8.a.isMutable()) {
                    asrVar8.B();
                }
                ((dus) asrVar8.a).d = i3;
                dus dusVar2 = (dus) asrVar8.z();
                if (!asrVar5.a.isMutable()) {
                    asrVar5.B();
                }
                dts dtsVar2 = (dts) asrVar5.a;
                dusVar2.getClass();
                dtsVar2.d = dusVar2;
                dtsVar2.b |= 2;
                eea byteString3 = ((dts) asrVar5.z()).toByteString();
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                ((dve) asrVar4.a).c = byteString3;
                dvn dvnVarD = dnq.d(dlxVar.e);
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                ((dve) asrVar4.a).d = dvnVarD.a();
                return dsg.b((dve) asrVar4.z());
            case 3:
                dmc dmcVar = (dmc) dliVar;
                drx drxVar4 = dnr.a;
                asr asrVar9 = (asr) dve.a.createBuilder();
                if (!asrVar9.a.isMutable()) {
                    asrVar9.B();
                }
                ((dve) asrVar9.a).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                asr asrVar10 = (asr) dtx.a.createBuilder();
                dty dtyVarB = dnr.b(dmcVar);
                if (!asrVar10.a.isMutable()) {
                    asrVar10.B();
                }
                dtx dtxVar = (dtx) asrVar10.a;
                dtyVarB.getClass();
                dtxVar.c = dtyVarB;
                dtxVar.b |= 1;
                int i4 = dmcVar.a;
                if (!asrVar10.a.isMutable()) {
                    asrVar10.B();
                }
                ((dtx) asrVar10.a).d = i4;
                eea byteString4 = ((dtx) asrVar10.z()).toByteString();
                if (!asrVar9.a.isMutable()) {
                    asrVar9.B();
                }
                ((dve) asrVar9.a).c = byteString4;
                dvn dvnVarC2 = dnr.c(dmcVar.d);
                if (!asrVar9.a.isMutable()) {
                    asrVar9.B();
                }
                ((dve) asrVar9.a).d = dvnVarC2.a();
                return dsg.b((dve) asrVar9.z());
            case 4:
                dmh dmhVar = (dmh) dliVar;
                dnu.c(dmhVar);
                asr asrVar11 = (asr) dve.a.createBuilder();
                if (!asrVar11.a.isMutable()) {
                    asrVar11.B();
                }
                ((dve) asrVar11.a).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                asr asrVar12 = (asr) dua.a.createBuilder();
                int i5 = dmhVar.a;
                if (!asrVar12.a.isMutable()) {
                    asrVar12.B();
                }
                ((dua) asrVar12.a).b = i5;
                eea byteString5 = ((dua) asrVar12.z()).toByteString();
                if (!asrVar11.a.isMutable()) {
                    asrVar11.B();
                }
                ((dve) asrVar11.a).c = byteString5;
                dvn dvnVarB2 = dnu.b(dmhVar.d);
                if (!asrVar11.a.isMutable()) {
                    asrVar11.B();
                }
                ((dve) asrVar11.a).d = dvnVarB2.a();
                return dsg.b((dve) asrVar11.z());
            case 5:
                dml dmlVar = (dml) dliVar;
                drx drxVar5 = dnv.a;
                asr asrVar13 = (asr) dve.a.createBuilder();
                if (!asrVar13.a.isMutable()) {
                    asrVar13.B();
                }
                ((dve) asrVar13.a).b = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                asr asrVar14 = (asr) duc.a.createBuilder();
                int i6 = dmlVar.a;
                if (!asrVar14.a.isMutable()) {
                    asrVar14.B();
                }
                ((duc) asrVar14.a).b = i6;
                eea byteString6 = ((duc) asrVar14.z()).toByteString();
                if (!asrVar13.a.isMutable()) {
                    asrVar13.B();
                }
                ((dve) asrVar13.a).c = byteString6;
                dvn dvnVarB3 = dnv.b(dmlVar.b);
                if (!asrVar13.a.isMutable()) {
                    asrVar13.B();
                }
                ((dve) asrVar13.a).d = dvnVarB3.a();
                return dsg.b((dve) asrVar13.z());
            case 6:
                dmp dmpVar = (dmp) dliVar;
                drx drxVar6 = dny.a;
                asr asrVar15 = (asr) dve.a.createBuilder();
                if (!asrVar15.a.isMutable()) {
                    asrVar15.B();
                }
                ((dve) asrVar15.a).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                eea byteString7 = dug.a.toByteString();
                if (!asrVar15.a.isMutable()) {
                    asrVar15.B();
                }
                ((dve) asrVar15.a).c = byteString7;
                dvn dvnVarB4 = dny.b(dmpVar.a);
                if (!asrVar15.a.isMutable()) {
                    asrVar15.B();
                }
                ((dve) asrVar15.a).d = dvnVarB4.a();
                return dsg.b((dve) asrVar15.z());
            case 7:
                dnl dnlVar = (dnl) dliVar;
                drx drxVar7 = doj.a;
                asr asrVar16 = (asr) dve.a.createBuilder();
                if (!asrVar16.a.isMutable()) {
                    asrVar16.B();
                }
                ((dve) asrVar16.a).b = "type.googleapis.com/google.crypto.tink.XAesGcmKey";
                asr asrVar17 = (asr) dvq.a.createBuilder();
                asr asrVar18 = (asr) dvr.a.createBuilder();
                int i7 = dnlVar.b;
                if (!asrVar18.a.isMutable()) {
                    asrVar18.B();
                }
                ((dvr) asrVar18.a).b = i7;
                dvr dvrVar = (dvr) asrVar18.z();
                if (!asrVar17.a.isMutable()) {
                    asrVar17.B();
                }
                dvq dvqVar = (dvq) asrVar17.a;
                dvrVar.getClass();
                dvqVar.d = dvrVar;
                dvqVar.b |= 1;
                eea byteString8 = ((dvq) asrVar17.z()).toByteString();
                if (!asrVar16.a.isMutable()) {
                    asrVar16.B();
                }
                ((dve) asrVar16.a).c = byteString8;
                dvn dvnVarB5 = doj.b(dnlVar.a);
                if (!asrVar16.a.isMutable()) {
                    asrVar16.B();
                }
                ((dve) asrVar16.a).d = dvnVarB5.a();
                return dsg.b((dve) asrVar16.z());
            case 8:
                dnp dnpVar = (dnp) dliVar;
                drx drxVar8 = dol.a;
                asr asrVar19 = (asr) dve.a.createBuilder();
                if (!asrVar19.a.isMutable()) {
                    asrVar19.B();
                }
                ((dve) asrVar19.a).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                eea byteString9 = dvt.a.toByteString();
                if (!asrVar19.a.isMutable()) {
                    asrVar19.B();
                }
                ((dve) asrVar19.a).c = byteString9;
                dvn dvnVarB6 = dol.b(dnpVar.a);
                if (!asrVar19.a.isMutable()) {
                    asrVar19.B();
                }
                ((dve) asrVar19.a).d = dvnVarB6.a();
                return dsg.b((dve) asrVar19.z());
            case 9:
                dot dotVar = (dot) dliVar;
                drx drxVar9 = dox.a;
                asr asrVar20 = (asr) dve.a.createBuilder();
                if (!asrVar20.a.isMutable()) {
                    asrVar20.B();
                }
                ((dve) asrVar20.a).b = "type.googleapis.com/google.crypto.tink.AesSivKey";
                asr asrVar21 = (asr) due.a.createBuilder();
                int i8 = dotVar.a;
                if (!asrVar21.a.isMutable()) {
                    asrVar21.B();
                }
                ((due) asrVar21.a).b = i8;
                eea byteString10 = ((due) asrVar21.z()).toByteString();
                if (!asrVar20.a.isMutable()) {
                    asrVar20.B();
                }
                ((dve) asrVar20.a).c = byteString10;
                dvn dvnVarB7 = dox.b(dotVar.b);
                if (!asrVar20.a.isMutable()) {
                    asrVar20.B();
                }
                ((dve) asrVar20.a).d = dvnVarB7.a();
                return dsg.b((dve) asrVar20.z());
            case 10:
                dpn dpnVar = (dpn) dliVar;
                drx drxVar10 = dpp.a;
                asr asrVar22 = (asr) dve.a.createBuilder();
                if (!asrVar22.a.isMutable()) {
                    asrVar22.B();
                }
                ((dve) asrVar22.a).b = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                asr asrVar23 = (asr) dux.a.createBuilder();
                duy duyVarB = dpp.b(dpnVar);
                if (!asrVar23.a.isMutable()) {
                    asrVar23.B();
                }
                dux duxVar = (dux) asrVar23.a;
                duyVarB.getClass();
                duxVar.c = duyVarB;
                duxVar.b |= 1;
                eea byteString11 = ((dux) asrVar23.z()).toByteString();
                if (!asrVar22.a.isMutable()) {
                    asrVar22.B();
                }
                ((dve) asrVar22.a).c = byteString11;
                dvn dvnVar = (dvn) dpp.g.d(dpnVar.d);
                if (!asrVar22.a.isMutable()) {
                    asrVar22.B();
                }
                ((dve) asrVar22.a).d = dvnVar.a();
                return dsg.b((dve) asrVar22.z());
            case 11:
                dpf dpfVar = (dpf) dliVar;
                drx drxVar11 = dqe.a;
                asr asrVar24 = (asr) dve.a.createBuilder();
                if (!asrVar24.a.isMutable()) {
                    asrVar24.B();
                }
                ((dve) asrVar24.a).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                asr asrVar25 = (asr) duj.a.createBuilder();
                duk dukVarC = dqe.c(dpfVar);
                if (!asrVar25.a.isMutable()) {
                    asrVar25.B();
                }
                duj dujVar = (duj) asrVar25.a;
                dukVarC.getClass();
                dujVar.c = dukVarC;
                dujVar.b |= 1;
                eea byteString12 = ((duj) asrVar25.z()).toByteString();
                if (!asrVar24.a.isMutable()) {
                    asrVar24.B();
                }
                ((dve) asrVar24.a).c = byteString12;
                dvn dvnVar2 = (dvn) dqe.g.d(dpfVar.e);
                if (!asrVar24.a.isMutable()) {
                    asrVar24.B();
                }
                ((dve) asrVar24.a).d = dvnVar2.a();
                return dsg.b((dve) asrVar24.z());
            case 12:
                dst dstVar = (dst) dliVar;
                drx drxVar12 = dti.a;
                asr asrVar26 = (asr) dve.a.createBuilder();
                if (!asrVar26.a.isMutable()) {
                    asrVar26.B();
                }
                ((dve) asrVar26.a).b = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                asr asrVar27 = (asr) dtp.a.createBuilder();
                dtq dtqVarB = dti.b(dstVar);
                if (!asrVar27.a.isMutable()) {
                    asrVar27.B();
                }
                dtp dtpVar = (dtp) asrVar27.a;
                dtqVarB.getClass();
                dtpVar.d = dtqVarB;
                dtpVar.b |= 1;
                int i9 = dstVar.a;
                if (!asrVar27.a.isMutable()) {
                    asrVar27.B();
                }
                ((dtp) asrVar27.a).c = i9;
                eea byteString13 = ((dtp) asrVar27.z()).toByteString();
                if (!asrVar26.a.isMutable()) {
                    asrVar26.B();
                }
                ((dve) asrVar26.a).c = byteString13;
                dvn dvnVarC3 = dti.c(dstVar.c);
                if (!asrVar26.a.isMutable()) {
                    asrVar26.B();
                }
                ((dve) asrVar26.a).d = dvnVarC3.a();
                return dsg.b((dve) asrVar26.z());
            default:
                dtb dtbVar = (dtb) dliVar;
                drx drxVar13 = dtl.a;
                asr asrVar28 = (asr) dve.a.createBuilder();
                if (!asrVar28.a.isMutable()) {
                    asrVar28.B();
                }
                ((dve) asrVar28.a).b = "type.googleapis.com/google.crypto.tink.HmacKey";
                asr asrVar29 = (asr) dus.a.createBuilder();
                dut dutVarA = dtl.a(dtbVar);
                if (!asrVar29.a.isMutable()) {
                    asrVar29.B();
                }
                dus dusVar3 = (dus) asrVar29.a;
                dutVarA.getClass();
                dusVar3.c = dutVarA;
                dusVar3.b |= 1;
                int i10 = dtbVar.a;
                if (!asrVar29.a.isMutable()) {
                    asrVar29.B();
                }
                ((dus) asrVar29.a).d = i10;
                eea byteString14 = ((dus) asrVar29.z()).toByteString();
                if (!asrVar28.a.isMutable()) {
                    asrVar28.B();
                }
                ((dve) asrVar28.a).c = byteString14;
                dvn dvnVar3 = (dvn) dtl.e.d(dtbVar.c);
                if (!asrVar28.a.isMutable()) {
                    asrVar28.B();
                }
                ((dve) asrVar28.a).d = dvnVar3.a();
                return dsg.b((dve) asrVar28.z());
        }
    }
}
