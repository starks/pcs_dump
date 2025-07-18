package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public class ConcurrentLinkedQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable, Collection<E> {
    private static final j$.com.android.tools.r8.b a;
    private static final j$.com.android.tools.r8.b b;
    static final j$.com.android.tools.r8.b c;
    static final j$.com.android.tools.r8.b d;
    private static final long serialVersionUID = 196745693267521676L;
    volatile transient Node<E> head;
    private volatile transient Node<E> tail;

    static {
        try {
            a = new j$.com.android.tools.r8.b(ConcurrentLinkedQueue.class, "head", Node.class);
            b = new j$.com.android.tools.r8.b(ConcurrentLinkedQueue.class, "tail", Node.class);
            c = new j$.com.android.tools.r8.b(Node.class, "item", Object.class);
            d = new j$.com.android.tools.r8.b(Node.class, "next", Node.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public ConcurrentLinkedQueue() {
        Node<E> node = new Node<>();
        this.tail = node;
        this.head = node;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.util.function.Predicate r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 0
        L2:
            j$.util.concurrent.ConcurrentLinkedQueue$Node<E> r2 = r13.head
            r3 = 0
            r4 = 8
            r5 = r2
            r7 = r3
            r6 = 8
        Lb:
            if (r2 == 0) goto L58
            j$.util.concurrent.ConcurrentLinkedQueue$Node<E> r8 = r2.next
            E r9 = r2.item
            r10 = 1
            if (r9 == 0) goto L16
            r11 = 1
            goto L17
        L16:
            r11 = 0
        L17:
            if (r11 == 0) goto L29
            boolean r12 = r14.test(r9)
            if (r12 == 0) goto L29
            j$.com.android.tools.r8.b r11 = j$.util.concurrent.ConcurrentLinkedQueue.c
            boolean r9 = r11.a(r2, r9, r3)
            if (r9 == 0) goto L28
            r1 = 1
        L28:
            r11 = 0
        L29:
            if (r11 != 0) goto L35
            if (r8 == 0) goto L35
            int r6 = r6 + (-1)
            if (r6 != 0) goto L32
            goto L35
        L32:
            if (r2 != r8) goto L56
            goto L2
        L35:
            if (r5 == r2) goto L50
            j$.com.android.tools.r8.b r9 = j$.util.concurrent.ConcurrentLinkedQueue.d
            if (r7 == 0) goto L40
            boolean r10 = r9.a(r7, r5, r2)
            goto L4d
        L40:
            j$.com.android.tools.r8.b r12 = j$.util.concurrent.ConcurrentLinkedQueue.a
            boolean r12 = r12.a(r13, r5, r2)
            if (r12 == 0) goto L4c
            r9.d(r5, r5)
            goto L4d
        L4c:
            r10 = 0
        L4d:
            if (r10 == 0) goto L52
            r5 = r2
        L50:
            if (r11 == 0) goto L56
        L52:
            r7 = r2
            r5 = r8
            r6 = 8
        L56:
            r2 = r8
            goto Lb
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentLinkedQueue.a(java.util.function.Predicate):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private j$.util.concurrent.ConcurrentLinkedQueue.Node d(j$.util.concurrent.ConcurrentLinkedQueue.Node r3, j$.util.concurrent.ConcurrentLinkedQueue.Node r4, j$.util.concurrent.ConcurrentLinkedQueue.Node r5, j$.util.concurrent.ConcurrentLinkedQueue.Node r6) {
        /*
            r2 = this;
            if (r6 != 0) goto L6
            if (r4 != r5) goto L5
            goto L29
        L5:
            r6 = r5
        L6:
            j$.com.android.tools.r8.b r0 = j$.util.concurrent.ConcurrentLinkedQueue.d
            if (r3 == 0) goto Lf
            boolean r4 = r0.a(r3, r4, r6)
            goto L1d
        Lf:
            j$.com.android.tools.r8.b r1 = j$.util.concurrent.ConcurrentLinkedQueue.a
            boolean r6 = r1.a(r2, r4, r6)
            if (r6 == 0) goto L1c
            r0.d(r4, r4)
            r4 = 1
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r4 == 0) goto L2a
            if (r3 == 0) goto L29
            j$.com.android.tools.r8.b r4 = j$.util.concurrent.ConcurrentLinkedQueue.c
            java.lang.Object r4 = r4.b(r3)
            if (r4 == 0) goto L2a
        L29:
            return r3
        L2a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentLinkedQueue.d(j$.util.concurrent.ConcurrentLinkedQueue$Node, j$.util.concurrent.ConcurrentLinkedQueue$Node, j$.util.concurrent.ConcurrentLinkedQueue$Node, j$.util.concurrent.ConcurrentLinkedQueue$Node):j$.util.concurrent.ConcurrentLinkedQueue$Node");
    }

    private Object[] e(Object[] objArr) {
        int i;
        Object[] objArrCopyOf = objArr;
        loop0: while (true) {
            Node<E> nodeB = b();
            i = 0;
            while (nodeB != null) {
                E e = nodeB.item;
                if (e != null) {
                    if (objArrCopyOf == null) {
                        objArrCopyOf = new Object[4];
                    } else if (i == objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, (i + 4) * 2);
                    }
                    objArrCopyOf[i] = e;
                    i++;
                }
                Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
        }
        if (objArrCopyOf == null) {
            return new Object[0];
        }
        if (objArr == null || i > objArr.length) {
            return i == objArrCopyOf.length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i);
        }
        if (objArr != objArrCopyOf) {
            System.arraycopy(objArrCopyOf, 0, objArr, 0, i);
        }
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Node<E> node = null;
        Node<E> node2 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                break;
            }
            Node<E> node3 = new Node<>(object);
            if (node == null) {
                node = node3;
            } else {
                node2.getClass();
                d.c(node2, node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node<>();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Node<E> nodeB = b();
        while (nodeB != null) {
            E e = nodeB.item;
            if (e != null) {
                objectOutputStream.writeObject(e);
            }
            Node<E> node = nodeB.next;
            nodeB = nodeB == node ? this.head : node;
        }
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        return offer(e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        Node<E> node;
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        Node node2 = null;
        Node node3 = null;
        for (E e : collection) {
            e.getClass();
            Node node4 = new Node(e);
            if (node2 == null) {
                node2 = node4;
            } else {
                node3.getClass();
                d.c(node3, node4);
            }
            node3 = node4;
        }
        if (node2 == null) {
            return false;
        }
        Node<E> node5 = this.tail;
        Node<E> node6 = node5;
        while (true) {
            Node<E> node7 = node5.next;
            if (node7 == null) {
                if (d.a(node5, null, node2)) {
                    break;
                }
            } else if (node5 == node7) {
                Node<E> node8 = this.tail;
                Node<E> node9 = node6 != node8 ? node8 : this.head;
                node6 = node8;
                node5 = node9;
            } else if (node5 == node6) {
                node = node6;
                node6 = node;
                node5 = node7;
            } else {
                node = this.tail;
                if (node6 != node) {
                    node7 = node;
                    node6 = node;
                    node5 = node7;
                } else {
                    node6 = node;
                    node = node6;
                    node6 = node;
                    node5 = node7;
                }
            }
        }
        j$.com.android.tools.r8.b bVar = b;
        if (bVar.g(this, node6, node3)) {
            return true;
        }
        Node<E> node10 = this.tail;
        if (node3.next != null) {
            return true;
        }
        bVar.g(this, node10, node3);
        return true;
    }

    final Node b() {
        Node<E> node;
        Node<E> node2;
        boolean z;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                z = node2.item != null;
                if (z || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        f(node, node2);
        if (z) {
            return node2;
        }
        return null;
    }

    final void c(Consumer consumer, Node node) {
        while (true) {
            Node node2 = null;
            while (node != null) {
                Node<E> node3 = node.next;
                E e = node.item;
                if (e != null) {
                    consumer.accept(e);
                } else {
                    Node node4 = node;
                    while (node3 != null && node3.item == null) {
                        if (node4 == node3) {
                            break;
                        }
                        node4 = node3;
                        node3 = node3.next;
                    }
                    node = d(node2, node, node4, node3);
                }
                node2 = node;
                node = node3;
            }
            return;
            node = this.head;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a(new u());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> nodeD = null;
            while (node != null) {
                Node<E> node2 = node.next;
                E e = node.item;
                if (e == null) {
                    Node<E> node3 = node;
                    while (node2 != null && node2.item == null) {
                        if (node3 == node2) {
                            break;
                        }
                        node3 = node2;
                        node2 = node2.next;
                    }
                    nodeD = d(nodeD, node, node3, node2);
                } else {
                    if (obj.equals(e)) {
                        return true;
                    }
                    nodeD = node;
                }
                node = node2;
            }
            return false;
        }
    }

    final void f(Node node, Node node2) {
        if (node == node2 || !a.a(this, node, node2)) {
            return;
        }
        d.d(node, node);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        c(consumer, this.head);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return b() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new w(this);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        Node<E> node;
        e.getClass();
        Node node2 = new Node(e);
        Node<E> node3 = this.tail;
        Node<E> node4 = node3;
        while (true) {
            Node<E> node5 = node3.next;
            if (node5 == null) {
                if (d.a(node3, null, node2)) {
                    break;
                }
            } else if (node3 == node5) {
                Node<E> node6 = this.tail;
                Node<E> node7 = node4 != node6 ? node6 : this.head;
                node4 = node6;
                node3 = node7;
            } else if (node3 == node4) {
                node = node4;
                node4 = node;
                node3 = node5;
            } else {
                node = this.tail;
                if (node4 != node) {
                    node5 = node;
                    node4 = node;
                    node3 = node5;
                } else {
                    node4 = node;
                    node = node4;
                    node4 = node;
                    node3 = node5;
                }
            }
        }
        if (node3 == node4) {
            return true;
        }
        b.g(this, node4, node2);
        return true;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Queue
    public final Object peek() {
        Node<E> node;
        Node<E> node2;
        E e;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                e = node2.item;
                if (e != null || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        f(node, node2);
        return e;
    }

    @Override // java.util.Queue
    public E poll() {
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = node;
            while (true) {
                E e = node2.item;
                if (e != null && c.a(node2, e, null)) {
                    if (node2 != node) {
                        Node<E> node3 = node2.next;
                        if (node3 != null) {
                            node2 = node3;
                        }
                        f(node, node2);
                    }
                    return e;
                }
                Node<E> node4 = node2.next;
                if (node4 == null) {
                    f(node, node2);
                    return null;
                }
                if (node2 == node4) {
                    break;
                }
                node2 = node4;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> nodeD = null;
            while (node != null) {
                Node<E> node2 = node.next;
                E e = node.item;
                if (e == null) {
                    Node<E> node3 = node;
                    while (node2 != null && node2.item == null) {
                        if (node3 == node2) {
                            break;
                        }
                        node3 = node2;
                        node2 = node2.next;
                    }
                    nodeD = d(nodeD, node, node3, node2);
                } else {
                    if (obj.equals(e) && c.a(node, e, null)) {
                        d(nodeD, node, node, node2);
                        return true;
                    }
                    nodeD = node;
                }
                node = node2;
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        return a(new t(collection, 1));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        predicate.getClass();
        return a(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return a(new t(collection, 0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        while (true) {
            Node<E> nodeB = b();
            int i = 0;
            while (nodeB != null) {
                if (nodeB.item != null && (i = i + 1) == Integer.MAX_VALUE) {
                    return i;
                }
                Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
            return i;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        return new v(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i;
        int length;
        String[] strArr = null;
        loop0: while (true) {
            Node<E> nodeB = b();
            i = 0;
            length = 0;
            while (nodeB != null) {
                E e = nodeB.item;
                if (e != null) {
                    if (strArr == null) {
                        strArr = new String[4];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, i * 2);
                    }
                    String string = e.toString();
                    strArr[i] = string;
                    length += string.length();
                    i++;
                }
                Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
        }
        if (i == 0) {
            return "[]";
        }
        char[] cArr = new char[(i * 2) + length];
        cArr[0] = '[';
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                int i4 = i2 + 1;
                cArr[i2] = ',';
                i2 += 2;
                cArr[i4] = ' ';
            }
            String str = strArr[i3];
            int length2 = str.length();
            str.getChars(0, length2, cArr, i2);
            i2 += length2;
        }
        cArr[i2] = ']';
        return new String(cArr);
    }

    static final class Node<E> {
        volatile E item;
        volatile Node<E> next;

        Node(Object obj) {
            ConcurrentLinkedQueue.c.c(this, obj);
        }

        Node() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return e(null);
    }
}
