package tmpTask;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;

public class PostComment {
    private String text; // содержание комментария
    private String[] whoLiked; // кто поддержал

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');

        // Получаем все поля класса, включая приватные
        Field[] fields = getClass().getDeclaredFields();

        for (Field field : fields) {
            // Пропускаем статические поля, transient и вспомогательные
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers())) {
                continue;
            }

            // Снимаем ограничения доступа
            field.setAccessible(true);

            try {
                // Добавляем имя поля и его значение
                sb.append(field.getName()).append('=').append(field.get(this)).append(' ');
            } catch (IllegalAccessException e) {
                // Логирование или обработка исключения
                sb.append(field.getName()).append("=null").append(' ');
            }
        }

        sb.append(']');
        return sb.toString();
    }


/* PostComment{text='x', whoLiked=[x,x]},
    PostComment{text='x', whoLiked=null}]}*/
}