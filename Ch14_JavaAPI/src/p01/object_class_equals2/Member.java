package p01.object_class_equals2;

public class Member {

	public String id;

	public Member() {

	}

	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {	
		if (obj instanceof Member) { // Member instance∞° Object type¿∏∑Œ promotion
			Member member = (Member) obj;
			
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

}
