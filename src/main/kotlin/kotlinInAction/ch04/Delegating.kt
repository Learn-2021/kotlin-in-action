package kotlinInAction.ch04

//'by'키워드를 사용해서 아래와 같이 번잡한 클래스를 만들지 않아도 된다.
class DelegatingCollectionWithByKeyword<T>(
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList

class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()

    override val size: Int get() = innerList.size

    override fun isEmpty(): Boolean = innerList.isEmpty()
    override fun contains(element: T): Boolean = innerList.contains(element)
    override fun iterator(): Iterator<T> = innerList.iterator()
    override fun containsAll(elements: Collection<T>): Boolean
            = innerList.containsAll(elements)
}