package com.example.xuan.designmode;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String[] NAMS = new String[]{
            "策略模式","观察者模式","装饰者模式"
    };
    public static final String[] ACTIONS = new String[]{
            "com.action.strategy","com.action.observer","com.action.decorator"
    };

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new MAdapter(this,NAMS,ACTIONS));
    }

    class MAdapter extends RecyclerView.Adapter<MAdapter.ViewHolder> {
        private Context mContext;
        private String[] mNames;
        private String[] mActions;

        public MAdapter(Context context, String[] names, String[] actions) {
            this.mContext = context;
            this.mNames = names;
            this.mActions = actions;
        }

        @Override
        public MAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(mContext)
                    .inflate(R.layout.item_design, parent, false));
        }

        @Override
        public void onBindViewHolder(MAdapter.ViewHolder holder, int position) {
            holder.mTvName.setText(mNames[position]);
            holder.mTvName.setTag(mActions[position]);
            holder.mTvName.setOnClickListener(onClickListener);
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(view.getTag().toString());
                startActivity(intent);
            }
        };

        @Override
        public int getItemCount() {
            return mNames.length;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView mTvName;

            public ViewHolder(View itemView) {
                super(itemView);
                mTvName = itemView.findViewById(R.id.tv_name);
            }
        }

    }
}
