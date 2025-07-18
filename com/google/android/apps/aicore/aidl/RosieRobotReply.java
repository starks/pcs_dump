package com.google.android.apps.aicore.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bmr;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RosieRobotReply extends bmr {
    public static final Parcelable.Creator CREATOR = new RosieRobotReplyParcelableCreator();
    private final int safetyClassificationResult;
    private final String text;

    public RosieRobotReply(String str, int i) {
        this.text = str;
        this.safetyClassificationResult = i;
    }

    public static RosieRobotReply create(String str) {
        return new RosieRobotReply(str, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RosieRobotReply)) {
            return false;
        }
        RosieRobotReply rosieRobotReply = (RosieRobotReply) obj;
        return this.safetyClassificationResult == rosieRobotReply.safetyClassificationResult && Objects.equals(this.text, rosieRobotReply.text);
    }

    @Deprecated
    public int getSafetyClassificationResult() {
        return this.safetyClassificationResult;
    }

    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return Objects.hash(this.text, Integer.valueOf(this.safetyClassificationResult));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RosieRobotReplyParcelableCreator.writeToParcel(this, parcel, i);
    }

    @Deprecated
    public static RosieRobotReply create(String str, int i) {
        return new RosieRobotReply(str, i);
    }
}
