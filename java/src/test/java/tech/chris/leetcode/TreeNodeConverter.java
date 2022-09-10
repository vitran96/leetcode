package tech.chris.leetcode;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public final class TreeNodeConverter extends SimpleArgumentConverter {
    private static TreeNode convert (String[] values, int index, int level, int extraStep) {
        if (index >= values.length || values[index].equals("null")) {
            return null;
        }

        TreeNode currentRoot = new TreeNode(Integer.parseInt(values[index]));
        int nextLeftIndex = index + ((int) Math.pow(2, level));
        currentRoot.left = convert(values, nextLeftIndex + extraStep, level + 1, 0);
//        currentRoot.right = convert(values, 1 + nextLeftIndex, currentRoot.left == null ? level : level + 1,
//                                    currentRoot.left == null ? 0 : 1);
        currentRoot.right = convert(values, 1 + nextLeftIndex + extraStep, level + 1, currentRoot.left == null ? 0 : 1);

        return currentRoot;
    }

    @Override
    protected Object convert (Object source, Class<?> targetType) throws ArgumentConversionException {
        if (source instanceof String && TreeNode.class.isAssignableFrom(targetType)) {
            if (((String) source).length() == 0) {
                return null;
            }

            String[] strs = ((String) source).split(",");
            // TODO: fix
            return convert(strs, 0, 0, 0);
        } else {
            throw new IllegalArgumentException(
                "Conversion from " + source.getClass() + " to " + targetType + " not supported.");
        }
    }

}
