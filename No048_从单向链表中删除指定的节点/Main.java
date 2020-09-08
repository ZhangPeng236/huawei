package No048_从单向链表中删除指定的节点;

import java.util.Scanner;

class MyLinkedList {
	private Node headNode;
	private Node lastNode;
	public int size;

	private class Node {
		int data;
		Node nextNode;

		Node(int data) {
			this.data = data;
		}
	}

	public void init(int data) {
		Node node = new Node(data);
		headNode = node;
		lastNode = node;
		size = 1;
	}

	public void insert(int insData, int prevData) {
		Node insNode = new Node(insData);
		if (size == 1 && headNode.data == prevData && lastNode.data == prevData) {
			headNode.nextNode = insNode;
			lastNode = insNode;
		} else {
			Node tempNode = headNode;
			while (tempNode.data != prevData) {
				tempNode = tempNode.nextNode;
			}
			if (tempNode == lastNode) {
				tempNode.nextNode = insNode;
				lastNode = insNode;
			} else {
				insNode.nextNode = tempNode.nextNode;
				tempNode.nextNode = insNode;
			}
		}
		size++;
	}

	public Node remove(int data) {
		Node removedNode = null;
		if (headNode.data == data) {
			removedNode = headNode;
			headNode = headNode.nextNode;
		} else {
			Node tempNode = headNode;
			while (tempNode.nextNode.data != data) {
				tempNode = tempNode.nextNode;
			}
			if (tempNode.nextNode == lastNode) {
				removedNode = lastNode;
				tempNode.nextNode = null;
				lastNode = tempNode;
			} else {
				removedNode = tempNode.nextNode;
				tempNode.nextNode = tempNode.nextNode.nextNode;
			}
		}
		size--;
		return removedNode;
	}

	public void output() {
		StringBuilder sb = new StringBuilder();
		Node tempNode = headNode;
		while (tempNode != null) {
			sb.append(tempNode.data + " ");
			tempNode = tempNode.nextNode;
		}
		System.out.println(sb.toString());
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			MyLinkedList mll = new MyLinkedList();
			int n = scanner.nextInt();
			int headData = scanner.nextInt();
			mll.init(headData);
			for (int i = 1; i < n; i++) {
				int insData = scanner.nextInt();
				int prevData = scanner.nextInt();
				mll.insert(insData, prevData);
			}
			int remData = scanner.nextInt();
			mll.remove(remData);
			mll.output();
		}
		scanner.close();
	}
}