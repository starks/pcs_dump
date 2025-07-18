package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import defpackage.cxc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CallerInfo extends bmr {
    public static final Parcelable.Creator CREATOR = new CallerInfoParcelableCreator();
    private final int callerUid;
    private final cxc callingUidPackageNames;
    private final cxc callingUidPackageSigners;
    private final boolean fromIsolatedService;
    private final boolean isDebugKeyAicore;

    public CallerInfo(int i, List list, List list2, boolean z, boolean z2) {
        this.callerUid = i;
        this.callingUidPackageNames = cxc.o(list);
        this.callingUidPackageSigners = cxc.o(list2);
        this.fromIsolatedService = z;
        this.isDebugKeyAicore = z2;
    }

    public static CallerInfo create(int i, cxc cxcVar, cxc cxcVar2) {
        return create(i, cxcVar, cxcVar2, false, false);
    }

    public int getCallerUid() {
        return this.callerUid;
    }

    public cxc getCallingUidPackageNames() {
        return this.callingUidPackageNames;
    }

    public cxc getCallingUidPackageSigners() {
        return this.callingUidPackageSigners;
    }

    public boolean getFromIsolatedService() {
        return this.fromIsolatedService;
    }

    public boolean getIsDebugKeyAicore() {
        return this.isDebugKeyAicore;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        CallerInfoParcelableCreator.writeToParcel(this, parcel, i);
    }

    public static CallerInfo create(int i, cxc cxcVar, cxc cxcVar2, boolean z, boolean z2) {
        return new CallerInfo(i, cxcVar, cxcVar2, z, z2);
    }
}
