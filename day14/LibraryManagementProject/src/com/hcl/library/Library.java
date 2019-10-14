package com.hcl.library;

public class Library {

        private int id;
        private String name;
        private String author;
        private String edition;
        private String dept;
        private int totalBooks;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getEdition() {
			return edition;
		}
		public void setEdition(String edition) {
			this.edition = edition;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getTotalBooks() {
			return totalBooks;
		}
		public void setTotalBooks(int totalBooks) {
			this.totalBooks = totalBooks;
		}
		@Override
		public String toString() {
			return "Library [id=" + id + ", name=" + name + ", author=" + author + ", edition=" + edition + ", dept="
					+ dept + ", totalBooks=" + totalBooks + "]";
		}
        
        
}
