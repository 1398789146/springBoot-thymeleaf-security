package cn.liyang.jd.pojo;


public class Cat {

  private long id;
  private long parentId;
  private String name;
  private long typeId;

  @Override
  public String toString () {
    return "Cat{" + "id=" + id + ", parentId=" + parentId + ", name='" + name + '\'' + ", typeId=" + typeId + '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }

}
