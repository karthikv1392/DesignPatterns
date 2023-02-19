package org.filesystem;

public class Folder implements FileSystem {
    private String name;
    private java.util.List<FileSystem> files;

    public Folder(String name) {
        this.name = name;
        files = new java.util.ArrayList<>();
    }

    @Override
    public void addFS(FileSystem fs) {
        files.add(fs);
    }

    @Override
    public void removeFS(FileSystem fs) {
        files.remove(fs);
    }

    @Override
    public java.util.List<FileSystem> getFiles() {
        return files;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystem fs : files) {
            size += fs.getSize();
        }
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + " (" + getSize() + " bytes)");
        for (FileSystem fs : files) {
            fs.print(indent + "  ");
        }
    }
}
