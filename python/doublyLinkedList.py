
class Node:

    def __init__(self, data) -> None:
        self.data = data
        self.previous = None
        self.next = None

    def __repr__(self) -> str:
        return str(self.data)


class DoublyList:

    def __init__(self) -> None:
        self.num_count = 0
        self.head = None
        self.tail = None

    def insert(self, data):
        
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            self.tail = new_node

        else:
            new_node.previous = self.tail
            self.tail.next = new_node
            self.tail = new_node

        self.num_count += 1

    def travers(self):

        current = self.head

        while current is not None:
            print(current)
            current = current.next

    def middle_node(self):
        
        fast_point = self.head
        slow_point = self.head

        while fast_point.next is not None:
            fast_point = fast_point.next.next
            slow_point = slow_point.next

        return slow_point




if __name__ == "__main__":

    list1 = DoublyList()

    for i in range(19):
        list1.insert(i)

    list1.travers()
        