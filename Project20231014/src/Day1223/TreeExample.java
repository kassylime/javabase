package Day1223;

public class TreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Node 간단한 문제
		 * Tree t = new Tree();
		 * 
		 * public Node Add_Node(Object data){
			Node n = new Node(data);
			return n;
		   }	

		 * Node1 = t.Add_Node(null);
		 * Node2 = t.Add_Node(null);
		 * Node3 = t.Add_Node(null);
		 * 
		 * Node1.LConnect(Node2);
		 * Node1.RConnect(Node3);
		 * 
		 *       Node1
		 *  Node2     Node3     
		 *       
		 * */
		
		
		// TreeSet
		// 이진탐색트리 Binary Search Tree의 구조로 구성된 Set
		// 이진탐색트리
		// 1. 각 노드에 중복되지 않는 키 값이 존재
		// 2. 루트의 왼쪽 서브 트리는 해당 노드의 키보다 작은 키들로 구성
		// 3. 루트의 오른쪽 서브 트리는 해당 노드의 키보다 큰 키들로 구성
		// 4. 좌우의 서브 트리 또한 이진 탐색 트리여야 함
		
		
		// 탐색과정
		// 1. 루트 키와 찾고자 하는 값을 비교(맞을 경우 탐색 종료)
		// 2. 루트 키보다 작은 값이면 왼쪽으로 탐색 진행
		// 3. 루트 키보다 큰 값이면 오른쪽으로 탐색 진행
		
		// 값 추가 과정
		// 1. 루트키와 추가하려는 값에 대한 비교(같을 경우 오류 발생(중복 X))
		// 2. 루트키보다 작다면 왼쪽 탐색 후 값이 없다면 그 위치에 추가, 값이 있다면 다시 그 키와 비교해 왼쪽 / 오른쪽으로 이동을 진행
		// 3. 루트키보다 크다면 오른쪽으로 참색 후 값이 없다면 그 위치에 추가, 값이 있다면 다시 그 키와 비교해 왼쪽 / 오른족 이동을 진행
		
		// 값 삭제 과정
		// 값이 삭제되는 경우에 따라 처리를 다르게 진행
		// 1. 삭제하려는 값이 단말 노드인 경우
		// 2. 삭제하려는 값이 서브 트리가 1개 존재하는 경우
		// 3. 삭제하려는 값이 서브 트리가 2개인 경우(이진코드)
		
		// 자바 TreeSet은 이진 탐색 트리 중에서도 성능이 향상되어 있는 Red-Black으로 구현
		// 레드 블랙 : 부모보다 작은 값을 가지는 노드는 왼쪽의 자식 노드로, 큰 값을 가지는 노드는 오른쪽 자식으로 배치하는 형태의 설계 방식
		// >> 데이터 추가 / 삭제 시 트리가 한쪽으로 치우치지 않게 밸런스 있게 잡아주는 형태
		
	}

}
