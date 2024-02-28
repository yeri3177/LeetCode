/*
    1.선언 : int형 queue 선언, linkedlist 이용
    Queue<Integer> queue = new LinkedList<>();
    
    2.맨뒤에 값 추가 
    queue.offer(1);
    queue.add(3)
    
    3.queue에 첫번째 값을 반환하고 제거 비어있다면 null
    queue.poll();
    
    4.queue에 첫번째 값 제거
    queue.remove();
    queue.poll();
    
    5.queue 초기화
    queue.clear();
    
    6.queue의 첫번째 값 참조
    queue.peek();

    input : [[],[1],[100],[3001],[3002]]
    output : [null,1,2,3,3]
*/
class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }
    
    public int ping(int t) {// t=3002
        q.offer(t); // 큐 맨 뒤에 3002 추가 
        
        while (q.peek() < t - 3000) { // 1 < 2
            q.poll(); // 1 삭제 
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */