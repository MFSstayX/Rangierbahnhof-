public class Stack<ContentType>{
    private class StackNode{
        private ContentType content; 
        private StackNode next; 
        public StackNode(ContentType pContent){
            next = null; 
            content = pContent; 
        }
        public StackNode getNext() {
            return this.next; 
        }
        public void setNext(StackNode node){
            this.next = node; 
        }
        public ContentType getContent(){
            return this.content; 
        }
        public void setContent(ContentType content){
            this.content = content; 
        }

    }
    private StackNode head;
    public Stack(){
        head = null; 
    }
    public boolean isEmpty(){
        return (this.head == null); 
    }
    public ContentType top(){
        return head.getContent(); 
    }
    public void pop(){
        if(!isEmpty()){
            head = head.getNext(); 
        }
    }
    public void push(ContentType pContent) {
        StackNode node = new StackNode(pContent); 
        if(isEmpty()){
            head = node; 
        }else {
            node.setNext(head); 
            head = node; 
        }
    }
}