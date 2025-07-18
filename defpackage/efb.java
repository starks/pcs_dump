package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class efb extends edg {
    private static Map defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected ehi unknownFields = ehi.a;

    private static efb checkMessageInitialized(efb efbVar) throws efp {
        if (efbVar == null || efbVar.isInitialized()) {
            return efbVar;
        }
        throw efbVar.newUninitializedMessageException().a();
    }

    private int computeSerializedSize(egx egxVar) {
        return egxVar == null ? egr.a.b(this).a(this) : egxVar.a(this);
    }

    protected static efd emptyBooleanList() {
        return edq.a;
    }

    protected static efe emptyDoubleList() {
        return eej.a;
    }

    protected static efh emptyFloatList() {
        return ees.a;
    }

    protected static efi emptyIntList() {
        return efc.a;
    }

    protected static efl emptyLongList() {
        return efy.a;
    }

    public static efm emptyProtobufList() {
        return egs.a;
    }

    static efb getDefaultInstance(Class cls) throws ClassNotFoundException {
        efb efbVar = (efb) defaultInstanceMap.get(cls);
        if (efbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                efbVar = (efb) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (efbVar != null) {
            return efbVar;
        }
        efb defaultInstanceForType = ((efb) ehn.i(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static efd mutableCopy(efd efdVar) {
        int size = efdVar.size();
        return efdVar.e(size + size);
    }

    protected static Object newMessageInfo(egi egiVar, String str, Object[] objArr) {
        return new egt(egiVar, str, objArr);
    }

    public static efb parseFrom(efb efbVar, eea eeaVar, een eenVar) throws efp {
        efb partialFrom = parsePartialFrom(efbVar, eeaVar, eenVar);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    private static efb parsePartialFrom(efb efbVar, eea eeaVar, een eenVar) throws efp {
        eee eeeVarK = eeaVar.k();
        efb partialFrom = parsePartialFrom(efbVar, eeeVarK, eenVar);
        eeeVarK.z(0);
        return partialFrom;
    }

    protected static void registerDefaultInstance(Class cls, efb efbVar) {
        efbVar.markImmutable();
        defaultInstanceMap.put(cls, efbVar);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(efa.BUILD_MESSAGE_INFO, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return egr.a.b(this).b(this);
    }

    public final eeu createBuilder() {
        return (eeu) dynamicMethod(efa.NEW_BUILDER, null, null);
    }

    protected abstract Object dynamicMethod(efa efaVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return egr.a.b(this).i(this, (efb) obj);
        }
        return false;
    }

    @Override // defpackage.egj
    public final efb getDefaultInstanceForType() {
        return (efb) dynamicMethod(efa.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.egi
    public final egp getParserForType() {
        return (egp) dynamicMethod(efa.GET_PARSER, null, null);
    }

    @Override // defpackage.egi
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.egj
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void makeImmutable() {
        egr.a.b(this).f(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // defpackage.egi
    public final eeu newBuilderForType() {
        return (eeu) dynamicMethod(efa.NEW_BUILDER, null, null);
    }

    public efb newMutableInstance() {
        return (efb) dynamicMethod(efa.NEW_MUTABLE_INSTANCE, null, null);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(a.x(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = i | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    @Override // defpackage.egi
    public final eeu toBuilder() {
        eeu eeuVar = (eeu) dynamicMethod(efa.NEW_BUILDER, null, null);
        eeuVar.C(this);
        return eeuVar;
    }

    public String toString() {
        String string = super.toString();
        int i = egk.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        egk.b(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.egi
    public void writeTo(eei eeiVar) {
        egx egxVarB = egr.a.b(this);
        fsc fscVar = eeiVar.f;
        if (fscVar == null) {
            fscVar = new fsc(eeiVar);
        }
        egxVarB.m(this, fscVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInitialized(efb efbVar, boolean z) {
        byte bByteValue = ((Byte) efbVar.dynamicMethod(efa.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zJ = egr.a.b(efbVar).j(efbVar);
        if (z) {
            efbVar.dynamicMethod(efa.SET_MEMOIZED_IS_INITIALIZED, true != zJ ? null : efbVar, null);
        }
        return zJ;
    }

    public static efb parseFrom(efb efbVar, eee eeeVar, een eenVar) throws efp {
        efb partialFrom = parsePartialFrom(efbVar, eeeVar, eenVar);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    public final eeu createBuilder(efb efbVar) {
        eeu eeuVarCreateBuilder = createBuilder();
        eeuVarCreateBuilder.C(efbVar);
        return eeuVarCreateBuilder;
    }

    @Override // defpackage.edg
    public int getSerializedSize(egx egxVar) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(egxVar);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new IllegalStateException(a.x(iComputeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(egxVar);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public static efe mutableCopy(efe efeVar) {
        int size = efeVar.size();
        return efeVar.e(size + size);
    }

    public static efb parseFrom(efb efbVar, InputStream inputStream, een eenVar) throws efp {
        efb partialFrom = parsePartialFrom(efbVar, eee.J(inputStream), eenVar);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    static efb parsePartialFrom(efb efbVar, eee eeeVar, een eenVar) throws efp {
        efb efbVarNewMutableInstance = efbVar.newMutableInstance();
        try {
            egx egxVarB = egr.a.b(efbVarNewMutableInstance);
            egxVarB.k(efbVarNewMutableInstance, fdu.T(eeeVar), eenVar);
            egxVarB.f(efbVarNewMutableInstance);
            return efbVarNewMutableInstance;
        } catch (efp e) {
            if (e.a) {
                throw new efp(e);
            }
            throw e;
        } catch (ehg e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof efp) {
                throw ((efp) e3.getCause());
            }
            throw new efp(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof efp) {
                throw ((efp) e4.getCause());
            }
            throw e4;
        }
    }

    public static efh mutableCopy(efh efhVar) {
        int size = efhVar.size();
        return efhVar.e(size + size);
    }

    public static efb parseFrom(efb efbVar, byte[] bArr) throws efp {
        int length = bArr.length;
        een eenVar = een.a;
        egr egrVar = egr.a;
        efb partialFrom = parsePartialFrom(efbVar, bArr, 0, length, een.a);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    public static efi mutableCopy(efi efiVar) {
        int size = efiVar.size();
        return efiVar.e(size + size);
    }

    public static efl mutableCopy(efl eflVar) {
        int size = eflVar.size();
        return eflVar.e(size + size);
    }

    public static efb parseFrom(efb efbVar, byte[] bArr, een eenVar) throws efp {
        efb partialFrom = parsePartialFrom(efbVar, bArr, 0, bArr.length, eenVar);
        checkMessageInitialized(partialFrom);
        return partialFrom;
    }

    public static efm mutableCopy(efm efmVar) {
        int size = efmVar.size();
        return efmVar.e(size + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static efb parsePartialFrom(efb efbVar, byte[] bArr, int i, int i2, een eenVar) throws efp {
        if (i2 == 0) {
            return efbVar;
        }
        efb efbVarNewMutableInstance = efbVar.newMutableInstance();
        try {
            egx egxVarB = egr.a.b(efbVarNewMutableInstance);
            egxVarB.h(efbVarNewMutableInstance, bArr, 0, i2, new edm(eenVar));
            egxVarB.f(efbVarNewMutableInstance);
            return efbVarNewMutableInstance;
        } catch (efp e) {
            if (e.a) {
                throw new efp(e);
            }
            throw e;
        } catch (ehg e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof efp) {
                throw ((efp) e3.getCause());
            }
            throw new efp(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
