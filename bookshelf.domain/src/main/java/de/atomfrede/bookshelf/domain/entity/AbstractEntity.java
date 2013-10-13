package de.atomfrede.bookshelf.domain.entity;

public abstract class AbstractEntity implements IEntity {

	public boolean isNew() {
		return getId() == null;
	}

	public boolean isPersisted() {
		return !isNew();
	}

	public int hashCode() {
		return this.getClass().hashCode() + this.getId().hashCode();
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			return ((this.getClass().equals(obj.getClass()) && (this.getId()
					.equals(((AbstractEntity) obj).getId()))));
		} else {
			return false;
		}
	}

}
