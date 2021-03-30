package board.model;

public class BoardDto {
	private Long no;
	private String title;
	private String name;
	private String password;
	private String content;
	private String writer;
	private Integer reader;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Integer getReader() {
		return reader;
	}
	public void setReader(Integer reader) {
		this.reader = reader;
	}
	@Override
	public String toString() {
		return "BoardDto [content=" + content + ", name=" + name + ", no=" + no + ", password=" + password + ", reader="
				+ reader + ", title=" + title + ", writer=" + writer + "]";
	}
	
}
