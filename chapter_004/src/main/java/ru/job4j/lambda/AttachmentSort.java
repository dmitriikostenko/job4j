package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = new ArrayList<>(
                List.of(
                        new Attachment("image 1", 100),
                        new Attachment("image 2", 34),
                        new Attachment("image 3", 13)
                )
        );

        Comparator cmpBySize = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(cmpBySize);
        System.out.println(attachments);

        Comparator cmpByName = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getName().compareTo(right.getName());
            }
        };
        attachments.sort(cmpByName);
        System.out.println(attachments);
    }
}
