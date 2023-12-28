class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode currentNodeSum=result;
        ListNode currentNode1 = l1;
        ListNode currentNode2 = l2;
        int currentValue;
        int carry =0;
        while(true){
            currentValue = currentNode1.val+currentNode2.val+carry;
            currentNodeSum.val=currentValue%10;
            carry=currentValue/10;

            //end condition
            if(currentNode1.next==null){
                while(true){
                    //break condition
                    if(currentNode2.next==null){
                        break;
                    }
                    //move to next
                    currentNode2=currentNode2.next;
                    currentNodeSum.next=new ListNode();
                    currentNodeSum=currentNodeSum.next;
                    //add
                    currentValue = currentNode2.val+carry;
                    currentNodeSum.val=currentValue%10;
                    carry=currentValue/10;
                }
                break;
            } else if (currentNode2.next == null) {
                while(true){
                    //break condition
                    if(currentNode1.next==null){
                        break;
                    }
                    //move to next
                    currentNode1=currentNode1.next;
                    currentNodeSum.next=new ListNode();
                    currentNodeSum=currentNodeSum.next;
                    //add
                    currentValue = currentNode1.val+carry;
                    currentNodeSum.val=currentValue%10;
                    carry=currentValue/10;
                }
                break;
            }
            //move to next node
            currentNodeSum.next=new ListNode();
            currentNodeSum=currentNodeSum.next;
            currentNode1=currentNode1.next;
            currentNode2=currentNode2.next;
        }
        if(carry!=0){
            currentNodeSum.next=new ListNode(carry);
        }

        return result;
    }
}

