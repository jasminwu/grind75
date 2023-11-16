from typing import Optional

class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while fast is not None and slow is not None:

            if fast.next is None:
                break

            slow = slow.next
            fast = fast.next.next
        
        return slow