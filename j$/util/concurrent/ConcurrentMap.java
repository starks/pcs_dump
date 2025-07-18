package j$.util.concurrent;

import j$.util.Map;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes2.dex */
public interface ConcurrentMap<K, V> extends Map<K, V> {

    /* renamed from: j$.util.concurrent.ConcurrentMap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object $default$compute(java.util.concurrent.ConcurrentMap r2, java.lang.Object r3, java.util.function.BiFunction r4) {
            /*
            L0:
                java.lang.Object r0 = r2.get(r3)
            L4:
                java.lang.Object r1 = r4.apply(r3, r0)
                if (r1 == 0) goto L1a
                if (r0 == 0) goto L13
                boolean r0 = r2.replace(r3, r0, r1)
                if (r0 == 0) goto L0
                goto L19
            L13:
                java.lang.Object r0 = r2.putIfAbsent(r3, r1)
                if (r0 != 0) goto L4
            L19:
                return r1
            L1a:
                if (r0 == 0) goto L22
                boolean r0 = r2.remove(r3, r0)
                if (r0 == 0) goto L0
            L22:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentMap.CC.$default$compute(java.util.concurrent.ConcurrentMap, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            Object objApply;
            function.getClass();
            Object obj2 = concurrentMap.get(obj);
            if (obj2 != null || (objApply = function.apply(obj)) == null) {
                return obj2;
            }
            Object objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
            return objPutIfAbsent == null ? objApply : objPutIfAbsent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            Object objApply;
            biFunction.getClass();
            while (true) {
                Object obj2 = concurrentMap.get(obj);
                if (obj2 == null) {
                    return null;
                }
                objApply = biFunction.apply(obj, obj2);
                if (objApply == null) {
                    if (concurrentMap.remove(obj, obj2)) {
                        break;
                    }
                } else if (concurrentMap.replace(obj, obj2, objApply)) {
                    break;
                }
            }
            return objApply;
        }

        public static void $default$forEach(java.util.concurrent.ConcurrentMap concurrentMap, BiConsumer biConsumer) {
            biConsumer.getClass();
            for (Map.Entry<K, V> entry : concurrentMap.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (IllegalStateException unused) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
            biFunction.getClass();
            obj2.getClass();
            while (true) {
                Object objPutIfAbsent = concurrentMap.get(obj);
                while (objPutIfAbsent == null) {
                    objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                    if (objPutIfAbsent == null) {
                        return obj2;
                    }
                }
                Object objApply = biFunction.apply(objPutIfAbsent, obj2);
                if (objApply != null) {
                    if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                        return objApply;
                    }
                } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                    return null;
                }
            }
        }

        public static void $default$replaceAll(java.util.concurrent.ConcurrentMap concurrentMap, BiFunction biFunction) {
            biFunction.getClass();
            x xVar = new x(0, concurrentMap, biFunction);
            if (concurrentMap instanceof ConcurrentMap) {
                ((ConcurrentMap) concurrentMap).forEach(xVar);
            } else {
                $default$forEach(concurrentMap, xVar);
            }
        }
    }

    /* renamed from: j$.util.concurrent.ConcurrentMap$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            return concurrentMap instanceof ConcurrentMap ? ((ConcurrentMap) concurrentMap).computeIfAbsent(obj, function) : CC.$default$computeIfAbsent(concurrentMap, obj, function);
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V computeIfAbsent(K k, Function<? super K, ? extends V> function);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V getOrDefault(Object obj, V v);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);
}
