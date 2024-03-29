package cn.edu.swufe.beauty;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.time.Instant;
import java.util.List;

import cn.edu.swufe.beauty.R;


public class GvAdapter extends BaseAdapter{
    /*private Context context;
    private int mMaxPosition;
    private List<String> list;
    private Image img;

    public GvAdapter(Context context,List<String>list){
        this.context = context;
        this.list = list;
    }


    public int getCount(){
        mMaxPosition = list.size()+1;
        return mMaxPosition;
    }
    public int getMaxPosition(){
        return mMaxPosition;
    }

    public Object getItem(int position){
        return list.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(final int position, View v, ViewGroup
            parent) {
        ViewHolder vh=null;
        if (v==null){
            vh=new ViewHolder();
            v= LayoutInflater.from(context).inflate(R.layout.item_gd,parent,false);
            vh.img= (ImageView) v.findViewById(R.id.img);
            vh.demimg= (ImageView) v.findViewById(R.id.delimg);
            v.setTag(vh);}else{
            vh= (ViewHolder) v.getTag();
        }
        if (position==mMaxPosition-1){ //说明要显示
            Glide.with(context).load(R.drawable.photo).dontAnimate()
                    .centerCrop().into(vh.img);
            vh.img.setVisibility(View.VISIBLE);
            vh.demimg.setVisibility(View.GONE);
            if (position==6&&mMaxPosition==7){//设置最大6个。那么达到最大，就隐藏。
//                vh.img.setImageResource(R.drawable.id_photo);
                vh.img.setVisibility(View.GONE);
            }
        }else{//设置图片。
            vh.demimg.setVisibility(View.VISIBLE);
            Glide.with(context).load(list.get(position)).into(vh.img);//设置
        }
        //删除
        vh.demimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(position);
                notifyDataSetChanged();
            }
        });
        return v;
    }

    private void notifyDataSetChanged() {
    }

    public class ViewHolder{
        public ImageView img,demimg;
    }*/
}



