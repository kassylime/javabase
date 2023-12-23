package Day1223;

// 자료구조 이론에서 Node는 데이터를 저장하는 단위
// 해당 노드를 사용하려는 자료 구조에서 노드 간의 연결을 통해 데이터의 흐름을 표현

//노드에서 사용되는 용어
// 1. 루트 root : 구조 중에서 제일 최상위
// 2. 노드 node : 각각의 구성 요소
// 3. 레벨 level : 각각의 층을 나타내는 단어
// 4. 형제 sibling : 같은 레벨에 있는 노드를 의미
// 5. 간선 edge : 노드와 노드를 연결하는 선을 의미
// 6. 부모 parent : 노드의 바로 상위에 존재하는 노드를 의미
// 7. 자식 child : 노드의 바로 하위에 존재하는 노드 의미
// 8. 높이 height : 트리에서 사용하는 용어
// 9. 서브 : 노드 아래에 있는 노드
// 자식 = 서브 = 하위 = 파생

public class Node {
	Object data;
	Node left;
	Node right;
	int count; // 연결된 노드의 개수
	
	// 생성자, 처음 생성 시 전달받은 데이터를 노드에 넣어주고, 방향에 대한 값은 null로 표현
	public Node(Object data){
		this.data = data;
		left = null;
		right = null;
	}

//	public void PlusCount() {
//		count++;
//	}
//	
//	public void MinusCount() {
//		count--;
//	}
	
	public void LConnect(Node connected_node) {
		left = connected_node;
	}
	
	public void RConnect(Node connected_node) {
		right = connected_node;
	}
	
	public void LDisconnect(Node connected_node) {
		left = null;
	}
	
	public void RDisconnect(Node connected_node) {
		right = null;
	}
	

}